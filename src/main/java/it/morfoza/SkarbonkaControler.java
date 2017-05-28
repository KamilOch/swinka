package it.morfoza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Enumeration;
import java.util.List;

import static jdk.internal.dynalink.support.NameCodec.encode;

@Controller
public class SkarbonkaControler {

    private PiggyService piggyService;

    @Autowired
    public SkarbonkaControler(PiggyService piggyService) {
        this.piggyService = piggyService;
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/all";
    }

    @RequestMapping("/piggybanks")
    public String Piggybanks(

            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "city", required = false) String city,
            @RequestParam(value = "date", required = false) String date,
            @RequestParam(value = "target", required = false) String targer, Model model) {

        if (isStringEmpty(city)) {
            String error = encode("Wpisz nazwę miasta!");
            return "redirect:/?error= " + error;
        }


        model.addAttribute("name", name);
        model.addAttribute("target", targer);
        model.addAttribute("city", city);
        model.addAttribute("date", date);

        return "piggybanks";

    }

    @RequestMapping("/all")
    public String all(Model model) {
        List<PiggyBank> piggyBanks = piggyService.getAll();
        model.addAttribute("piggyBanks", piggyBanks);
        return "piggybanks";

    }

    @RequestMapping("/add_form")
    public String addForm() {
        return "add_piggybank_form";
    }


    @RequestMapping("/add_piggybank")
    public String addPage(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "target", required = true) long target,
            @RequestParam(value = "description", required = true) String description,
            @RequestParam(value = "long_description",required = true)String long_description,
            @RequestParam(value = "url_image",required = false)String url_image
                                                                 ) {


        if(isStringEmpty(url_image)){
            url_image= "resources/ob.jpg";
        }
        if (isStringEmpty(name)) {
            String error = encode("Wpisz nazwę!");
            return "redirect:/?error= " + error;
        }
        PiggyBank pig = new PiggyBank(name,  LocalDateTime.now().toString(), new Money(target), new Money(0),description,long_description,url_image);

        piggyService.add(pig);

        return "redirect:/all";
    }


    @RequestMapping("/piggybank")
    public String all(@RequestParam(value = "id", required = true) long id, Model model) {
        PiggyBank piggyBank = piggyService.getById(id);
        model.addAttribute("piggyBank", piggyBank);
        return "piggybank";

    }


    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "id", required = true) long id, Model model) {
        piggyService.delete(id);
        return "redirect:all";
    }

    @RequestMapping("/payin")
    public String all(@RequestParam(value = "id", required = true) long id, @RequestParam(value = "amount", required = true)  long amount) {
        piggyService.pay(id, new Money(amount));
        return "redirect:/all";

    }

    @RequestMapping("/confirm_payment")
    public void confirmPayment(HttpServletRequest req, HttpServletResponse resp) {

        System.out.println(req.getParameterMap());

        Enumeration<String> parameterNames = req.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String name = parameterNames.nextElement();
            System.out.println(name + "=" + req.getParameter(name));
        }

        String controlParam = req.getParameter("control");
        String amountParam = req.getParameter("operation_amount");
        String status = req.getParameter("operation_status");

        if ("completed".equals(status)) {
            long piggyBankId = Long.parseLong(controlParam);
            piggyService.pay(piggyBankId, new Money(new BigDecimal(amountParam)) );
        }

        try {
            resp.getWriter().print("OK");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    private boolean isStringEmpty(String string) {
        return string == null || string.equals("");
    }


}

package it.morfoza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Controller
public class SkarbonkaControler {

    private PiggyService piggyService;

    private List<Wygrany> pokazWszystkie = new ArrayList<>();

    @Autowired
    public SkarbonkaControler(PiggyService piggyService) {
        this.piggyService = piggyService;
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/all";
    }

    @RequestMapping("/registration_form")
    public String registration_form() {
        return "registration_form";
    }


    @RequestMapping("/all")
    public String all(Model model, @RequestParam(value = "type_piggybank", required = false) String type_piggybank) {

        if (type_piggybank == null) {
            type_piggybank = "";
        }

        model.addAttribute("type_piggybank", type_piggybank);

        List<PiggyBank> piggyBanks = piggyService.getAll();
        List<PiggyBank> filtered = new ArrayList<>();

        if (type_piggybank.equals("wszystkie")|| type_piggybank.equals("")) {
            // filtered.addAll(piggyBanks);
            filtered = piggyBanks;
        } else {
            // foreach po swinkach
            // dodajesz do filered tylko te ktore pasuj do parmetru
            for (int i = 0; i < piggyBanks.size(); i++) {
                System.out.println(i);
                PiggyBank piggyBank = piggyBanks.get(i);

                if (type_piggybank.equals(piggyBank.getType_piggybank())) {
                    filtered.add(piggyBank);


                }

            }
        }
        model.addAttribute("piggyBanks", filtered);
        return "piggybanks";
    }

    @RequestMapping("/log_in_form")
    public String log_in_form() {
        return "log_in_form";
    }

    @RequestMapping("/add_piggybank_form")
    public String addForm() {
        return "add_piggybank_form";
    }

    @RequestMapping("/edit_piggybank_form")
    public String editForm(@RequestParam(value = "id", required = true) long id, Model model) {
        PiggyBank piggyBank = piggyService.getById(id);
        model.addAttribute("piggyBank", piggyBank);
        return "edit_piggybank_form";
    }

    @RequestMapping("/admin")
    public String admin(Model model) {
        List<PiggyBank> piggyBanks = piggyService.getAll();
        model.addAttribute("piggyBanks", piggyBanks);
        return "admin";
    }

    @RequestMapping("/add_piggybank")
    public String addPage(
            @RequestParam(value = "type_piggybank", required = false) String type_piggybank,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "target", required = true) long target,
            @RequestParam(value = "description", required = true) String description,
            @RequestParam(value = "long_description", required = true) String long_description,
            @RequestParam(value = "url_image", required = false) String url_image,
            @RequestParam(value = "jakis_element", required = true) String jakis_element
    ) {


        if (isStringEmpty(name)) {
            String url = "Wpisz nazwę!";
            String error = encodeUrl(url);
            return "redirect:/?error= " + error;
        }
        PiggyBank pig = new PiggyBank(name, LocalDateTime.now().toString(), new Money(target), new Money(0), description, long_description, url_image, type_piggybank, jakis_element);

        piggyService.add(pig);

        return "redirect:/all";
    }


    @RequestMapping("/edit_piggybank")
    public String edit(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "target", required = true) long target,
            @RequestParam(value = "description", required = true) String description,
            @RequestParam(value = "long_description", required = true) String long_description,
            @RequestParam(value = "url_image", required = false) String url_image,
            @RequestParam(value = "type_piggybank", required = true) String type_piggybank,
            @RequestParam(value = "jakis_element", required = true) String jakis_element

    ) {

        if (isStringEmpty(name)) {
            String error = encodeUrl("Wpisz nazwę!");
            return "redirect:/?error= " + error;
        }
        PiggyBank piggyBank = piggyService.getById(id);
        piggyBank.setName(name);
        piggyBank.setDescription(description);
        piggyBank.setLong_description(long_description);
        piggyBank.setTarget(new Money(target));
        piggyBank.setUrl_image(url_image);
        piggyBank.setType_piggybank(type_piggybank);
        piggyBank.setJakis_element(jakis_element);

        piggyService.update(piggyBank);

        return "redirect:/admin";
    }

    @RequestMapping("/piggybank")
    public String piggyBank(@RequestParam(value = "id", required = true) long id, Model model) {
        PiggyBank piggyBank = piggyService.getById(id);
        model.addAttribute("piggyBank", piggyBank);
        return "piggybank";

    }


    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "id", required = true) long id, Model model) {
        piggyService.delete(id);
        return "redirect:admin";
    }

    @RequestMapping("/payin")
    public String all(@RequestParam(value = "id", required = true) long id, @RequestParam(value = "amount", required = true) long amount) {
        piggyService.pay(id, new Money(amount), "");
        return "redirect:/all";
    }

    @RequestMapping("/payments")
    public String payments(@RequestParam(value = "id", required = true) long id, Model model) {
        model.addAttribute("payments", piggyService.getPaymentsForPiggyBank(id));
        model.addAttribute("piggyBank", piggyService.getById(id));
        return "payments";
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
            piggyService.pay(piggyBankId, new Money(new BigDecimal(amountParam)), req.getParameter("email"));
        }

        try {
            resp.getWriter().print("OK");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @RequestMapping("/calculatorLiczby")
    public String calculatorLiczby(){
        return "calculatorLiczby";
    }


    @RequestMapping("/calculatorWynik")
    public String wynik (
        int liczba1,
        int liczba2,
        Model model
    ){
        int wynikDodawania = liczba1 + liczba2;
        int wynikOdejmowania = liczba1 - liczba2;
        int wynikMnozenia = liczba1 * liczba2;
        int wynikDzielenia = liczba1/liczba2;

        model.addAttribute("wynikDodawania", wynikDodawania);
        model.addAttribute("wynikOdejmowania", wynikOdejmowania);
        model.addAttribute("wynikMnozenia", wynikMnozenia);
        model.addAttribute("wynikDzielenia", wynikDzielenia);

        return "calculatorWynik";
    }

    @RequestMapping("/processing")
    public String startGry (
            Model model) {
        return "processing"; }

    @RequestMapping("/rekordy")
    public String rekordyGry (
            Model model) {
        return "rekordy";
    }

    @RequestMapping("/zwyciezca")
    public String wygranyGry (
            //Model model,
           // @RequestParam(value = "imie", required = true) String imie,
           // @RequestParam(value = "punkty", required = true) int punkty
    ) {
        //PiggyBank pig = new PiggyBank(name, LocalDateTime.now().toString(), new Money(target), new Money(0), description, long_description, url_image, type_piggybank, jakis_element);

        //Wygrany wygrany = new Wygrany(imie,punkty);
        //piggyService.add(pig);
       // pokazWszystkie.add(wygrany);
        //ListaWygranych zwyciezcyForm = new ListaWygranych();
        //model.addAttribute("wygrani", pokazWszystkie);

        return "zwyciezca";
    }

    @RequestMapping("/zwyciezcy")
    public String wygraniGry (
            //Model model,
            @RequestParam(value = "imie", required = true) String imie,
            @RequestParam(value = "punkty", required = true) int punkty
    ) {

        Wygrany wygrany = new Wygrany(imie,punkty);

        pokazWszystkie.add(wygrany);

        return "redirect:/zwyciezca";
    }

    @RequestMapping("/lista")
    public String pokazWszystkie(Model model) {


        model.addAttribute("wygrani", pokazWszystkie);
        return "lista";

    }

    @PostMapping("/save")
    public String saveWygrany(@ModelAttribute ListaWygranych form, Model model) {
        pokazWszystkie.addAll(form.getWygrani());

      //  model.addAttribute("books", pokazWszystkie.addAll());
        return "redirect:/books/all";
    }

    private boolean isStringEmpty(String string) {
        return string == null || string.equals("");
    }


    private static String encodeUrl(String url) {
        try {
            return URLEncoder.encode(url, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

}


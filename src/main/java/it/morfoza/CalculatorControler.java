package it.morfoza;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorControler {

    private Calculator calculator;



    @RequestMapping("/podajImie")
    public String pobieranieImienia(){
        return "podajImie";
    }

    @RequestMapping("/powitanie")
    public String powitanie (
            String imie,
            Model model
    ){
        model.addAttribute("imie", imie);
        return "powitanie";
    }


}

package org.launchcode.hellospring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController<value> {

    @GetMapping()
    public String helloForm() {
        String form = "<html>" +
                "<body>" +
                "<form method='post' action='/choice'>" +
                "<input type = 'text' name= 'name'>" +
                "<select name='choice'>" +
                "<option name ='English'>English</option>" +
                "<option name= 'Spanish'>Spanish</option>" +
                "<option name ='French'>French</option>" +
                "<option name ='Kannada'>Kannada</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
        return form;
    }

    @PostMapping("choice")
    public String choice(@RequestParam String name, String choice) {
        String ch = choice;
        if (ch.matches("English")) {
            ch= "Hello, ";
        } else if (ch.matches("Spanish")) {
            ch="Hola, ";
        } else if (ch.matches("French")) {
            ch="Bonjour, ";

        } else if (ch.matches("Kannada")) {
           ch="Namaskara, ";
        }
            return ch + name +"!";
    }

}
package Basic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;


@Controller
public class MainController {

    @RequestMapping(value = { "/", "/head" }, method = RequestMethod.GET)
    public String head(Model model) {
           return "head";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model ) {

        return "login";
    }


    /*@RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {

        if (principal != null) {
            model.addAttribute("message", "Hi " + principal.getName()
                    + "<br> You do not have permission to access this page!");
        } else {
            model.addAttribute("msg",
                    "You do not have permission to access this page!");
        }
        return "403Page";
    }*/
}
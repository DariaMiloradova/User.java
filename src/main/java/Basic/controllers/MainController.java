package Basic.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;


@Controller
public class MainController {
    private Logger logger = LoggerFactory.getLogger(MainController.class);
    @RequestMapping(value = { "/", "/head" }, method = RequestMethod.GET)
    public String head(Model model) {

        logger.info("HELLO!!");
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
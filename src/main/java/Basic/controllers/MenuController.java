package Basic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

    @GetMapping("/about")
    public String getAboutPage()
    {
        return "about";
    }

    @GetMapping("/user/contact")
    public String getContacts(){
        return "contact";
    }
}

package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        return "fancy-login";
    }

    @GetMapping("/")
    public String showLanding() {
        return "landing";
    }

    @GetMapping("/employees")
    public String showHome() {
        return "home";
    }
}

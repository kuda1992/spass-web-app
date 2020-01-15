package io.spass.spasswebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


    @GetMapping(value = "/")
    public String helloWord() {
        return "hello world";
    }
}

package hotelwebapp;
/*
19.03.2020
created by yalind
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }
}

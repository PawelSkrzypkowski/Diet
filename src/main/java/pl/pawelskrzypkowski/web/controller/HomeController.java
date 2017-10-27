package pl.pawelskrzypkowski.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Paweł on 13.09.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/secured")
    @ResponseBody
    public String secured() {
        return "registerSuccess";
    }

}

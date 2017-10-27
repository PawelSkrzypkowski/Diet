package pl.pawelskrzypkowski.web.controller;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.pawelskrzypkowski.model.User;
import pl.pawelskrzypkowski.service.UserService;

import javax.validation.Valid;

/**
 * Created by Paweł on 13.09.2017.
 */
@Controller
public class UserController {

    @Autowired
    @Setter
    private UserService userService;

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "registerForm";
    }

    @PostMapping("/register")
    public String addUser(@ModelAttribute @Valid User user,
                          BindingResult bindResult) {
        if(bindResult.hasErrors())
            return "registerForm";
        else {
            userService.addWithDefaultRole(user);
            return "registerSuccess";
        }
    }

}

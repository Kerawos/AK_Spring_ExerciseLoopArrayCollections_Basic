package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Model model){
        return "welcome";
    }

}

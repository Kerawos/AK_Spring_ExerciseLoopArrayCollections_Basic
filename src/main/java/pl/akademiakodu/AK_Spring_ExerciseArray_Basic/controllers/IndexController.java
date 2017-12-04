package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Control index page
 */
@Controller
public class IndexController {

    /**
     * To get index template
     * @return index template
     */
    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }

}

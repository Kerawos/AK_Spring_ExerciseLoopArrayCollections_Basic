package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoopController {

    @GetMapping("/loop")
    public String getLoop(){
        return "loop";
    }

}

package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CollectionsController {

    @GetMapping("/collections")
    public String getCollection(Model model){
        return "collections";
    }
}

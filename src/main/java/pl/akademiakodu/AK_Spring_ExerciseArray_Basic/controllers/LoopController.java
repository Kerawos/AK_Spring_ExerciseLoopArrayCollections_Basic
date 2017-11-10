package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.OnlyLoop;
import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.bags.UserInputModel;

import java.util.Arrays;

@Controller
public class LoopController {

    private OnlyLoop onlyLoop;

    @GetMapping("/loop")
    public String getLoop(){
        return "loop";
    }

    @PostMapping("/loop")
    public String postLoop(Model model){
        onlyLoop = new OnlyLoop();
        model.addAttribute("message1", "YOUR RESULT LOOK: " + onlyLoop.print5TimesHelloWorld());
        model.addAttribute("message2", "YOUR RESULT LOOK: " + onlyLoop.printDigitsFrom8To15Without10());
        model.addAttribute("message3", "YOUR RESULT LOOK: " + onlyLoop.printFirst12OddDigits());
        model.addAttribute("message4", "YOUR RESULT LOOK: " + onlyLoop.print3SOS());
        model.addAttribute("message5", "YOUR RESULT LOOK: " + onlyLoop.factorialOf5());
        model.addAttribute("message6", "YOUR RESULT LOOK: " + onlyLoop.generate6LottoDigits());
        return "loop";
    }

}

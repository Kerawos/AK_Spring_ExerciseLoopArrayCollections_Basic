package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.controllers;

/**
 * Import section
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services.OnlyLoop;

/**
 * Controller responsible for loop exercise
 */
@Controller
public class LoopController {

    /**
     * Variables and services declaration
     */
    @Autowired private OnlyLoop onlyLoop;

    /**
     * Method get to user template
     * @return template
     */
    @GetMapping("/loop")
    public String getLoop(){
        return "loop";
    }

    /**
     * Method responsible to show model logic results
     * @param model holding calculations
     * @return result logic
     */
    @PostMapping("/loop")
    public String postLoop(Model model){
        model.addAttribute("message1", "YOUR RESULT LOOK: " + onlyLoop.print5TimesHelloWorld());
        model.addAttribute("message2", "YOUR RESULT LOOK: " + onlyLoop.printDigitsFrom8To15Without10());
        model.addAttribute("message3", "YOUR RESULT LOOK: " + onlyLoop.printFirst12OddDigits());
        model.addAttribute("message4", "YOUR RESULT LOOK: " + onlyLoop.print3SOS());
        model.addAttribute("message5", "YOUR RESULT LOOK: " + onlyLoop.factorialOf5());
        model.addAttribute("message6", "YOUR RESULT LOOK: " + onlyLoop.generate6LottoDigits());
        return "loop";
    }

}

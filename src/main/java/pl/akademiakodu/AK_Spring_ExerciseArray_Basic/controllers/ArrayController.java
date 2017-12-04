package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.controllers;

/**
 * Import section
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.UserInputModel;
import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services.ArrayConverter;
import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services.ArrayIndicator;
import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services.OnlyArray;

import java.util.Arrays;

/**
 * Controller responsible for array exercise
 */
@Controller
public class ArrayController {

    /**
     * Variables and services declaration
     */
    @Autowired private OnlyArray onlyArray;
    @Autowired private ArrayConverter arrayConverter;
    @Autowired private ArrayIndicator arrayIndicator;
    private UserInputModel userInputModel;

    /**
     * Method get to user template to fill and submit
     * @param model giving user input model to store inputs
     * @return fulfilled template user input
     */
    @GetMapping("/array")
    public String arrayGet(Model model){
        model.addAttribute("userInputModel", new UserInputModel());
        return "array";
    }

    /**
     * Method responsible for getting result of array logic
     * @param userInputModel holding user inputs
     * @param model holding calculations
     * @return calculations from services
     */
    @PostMapping("/array")
    public String arrayPost(@ModelAttribute("userInputModel") UserInputModel userInputModel, Model model){
        //making array from string
        String[]ourArray = arrayConverter.toArray(userInputModel.getUserInput());
        //check which kind of array
        if (arrayIndicator.isIntArray(ourArray)){
            //we got int array
            int[]ourIntArray = arrayConverter.generateIntArray(ourArray);
            model.addAttribute("message1", "USER INPUT: " + userInputModel.getUserInput());
            model.addAttribute("message2", "Biggest number is : " + onlyArray.maxOf(ourIntArray));
            model.addAttribute("message3", "Smallest number is : " + onlyArray.minOf(ourIntArray));
            model.addAttribute("message4", "Average number is : " + onlyArray.averageOf(ourIntArray));
            model.addAttribute("message5", "Sorted array : " + Arrays.toString(onlyArray.sortAsc(ourIntArray)));
            model.addAttribute("message6", "Even array is : " + Arrays.toString(onlyArray.removeOdd(ourIntArray)));
        } else {
            //still String array
            model.addAttribute("message1", "USER INPUT: " + userInputModel.getUserInput());
            model.addAttribute("message2", "Longest word is : " + onlyArray.longestOf(ourArray));
        }
        return "array";
    }

}

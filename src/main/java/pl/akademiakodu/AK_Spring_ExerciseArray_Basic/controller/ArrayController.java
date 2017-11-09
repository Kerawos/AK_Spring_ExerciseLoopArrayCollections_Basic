package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.OnlyArray;
import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.bags.UserInputModel;
import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.services.ArrayConverter;
import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.services.ArrayIndicator;

import java.util.Arrays;

@Controller
public class ArrayController {

    OnlyArray onlyArray;
    ArrayConverter arrayConverter;
    UserInputModel userInputModel;


    @GetMapping("/array")
    public String arrayGet(Model model){
        model.addAttribute("userInputModel", new UserInputModel());
        return "array";
    }

    @PostMapping("/array")
    public String arrayPost(@ModelAttribute("userInputModel") UserInputModel userInputModel, Model model){
        onlyArray = new OnlyArray();
        arrayConverter = new ArrayConverter();
        //making array from string
        String[]ourArray = arrayConverter.toArray(userInputModel.getUserInput());
        //check which kind of array
        if (ArrayIndicator.isIntArray(ourArray)){
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

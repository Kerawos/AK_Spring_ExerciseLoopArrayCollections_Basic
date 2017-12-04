package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services;

import org.springframework.stereotype.Service;

@Service
public class ArrayConverter implements InputToArray {

    @Override
    public String[] toArray(String userInput){
        String[] strings = userInput.split(",");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("\\s*","");
        }
        return strings;
    }

    @Override
    public int[] generateIntArray(String[] stringArray) {
        int[]ints = new int[stringArray.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.valueOf(stringArray[i]);
        }
        return ints;
    }

}

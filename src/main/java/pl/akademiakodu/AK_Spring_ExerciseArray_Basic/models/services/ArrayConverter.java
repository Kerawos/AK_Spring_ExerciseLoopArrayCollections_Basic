package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services;

/**
 * Import section
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Responsible for convert string into array.
 */
@Service
public class ArrayConverter implements InputToArray {

    /**
     * Declaring Indicator service
     */
    @Autowired ArrayIndicator arrayIndicator;


    @Override
    public String[] toArray(String userInput){
        String[] strings = userInput.split(",");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("\\s*","");
        }
        return strings;
    }

    @Override
    public int[] generateIntArray(String[] stringArray) throws IllegalArgumentException {
        int[]ints = new int[stringArray.length];
        for (int i = 0; i < ints.length; i++) {
            if (arrayIndicator.isInteger(stringArray[i])){
                ints[i] = Integer.valueOf(stringArray[i]);
            } else {
                throw new IllegalArgumentException("String cannot be parse to integer");
            }
        }
        return ints;
    }

}

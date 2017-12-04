package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services;

import org.springframework.stereotype.Service;

@Service
public class ArrayIndicator {

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }

    public static boolean isIntArray(String[] unknownArray){
        for (String o : unknownArray) {
            if (!isInteger(o)){
                return false;
            }
        }
        return true;
    }

}

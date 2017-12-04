package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services;

/**
 * Import section
 */
import org.springframework.stereotype.Service;

/**
 * Indicate simple request, checks
 */
@Service
public class ArrayIndicator {

    /**
     * Method responsible for indicate if given string can be parse to integer
     * @param s as string
     * @return result of parsing
     */
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }

    /**
     * Method responsible for indicate if given string array can be parse to integer array
     * @param unknownArray string array
     * @return result of parsing
     */
    public boolean isIntArray(String[] unknownArray){
        for (String o : unknownArray) {
            if (!isInteger(o)){
                return false;
            }
        }
        return true;
    }

}

package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services;

/**
 * Import section
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Responsible for array calculations
 */
@Service
public class OnlyArray {

    /**
     * Services declaration
     */
    @Autowired ArrayIndicator arrayIndicator;
    @Autowired ArrayConverter arrayConverter;

    /**
     * Method calculating maximum integer in given integer array
     * @param intArray
     * @return maximum element of array
     */
    public int maxOf(int[] intArray){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]>max){
                max=intArray[i];
            }
        }
        return max;
    }

    /**
     * Method calculating minimum integer in given integer array
     * @param ints
     * @return maximum element of array
     */
    public int minOf(int... ints){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]<min){
                min=ints[i];
            }
        }
        return min;
    }

    /**
     * Method calculating average integer in given integer array
     * @param ints
     * @return average element of array
     */
    public double averageOf(int... ints){
        double sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum+=ints[i];
        }
        return (double)((int)((sum/ints.length)*100))/100;
    }

    /**
     * Method calculating longest word in given string array
     * @param strings
     * @return longest element of array
     */
    public String longestOf (String... strings){
        String longestString = null;
        int length = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length()>length){
                longestString = strings[i];
                length = strings[i].length();
            }
        }
        return longestString;
    }

    /**
     * Method sort listed int array from lowest value up to maximum value
     * @param nonSortedArray
     * @return ascending order sorted int array
     */
    public int[] sortAsc(int[] nonSortedArray){
        int[] sortedArray = nonSortedArray;
        int temp;
        for (int i = 0; i < nonSortedArray.length-1; i++)
        {
            for (int j = i+1; j < nonSortedArray.length; j++)
            {
                if (nonSortedArray[i] > nonSortedArray[j])
                {
                    temp = nonSortedArray[i];
                    nonSortedArray[i] = nonSortedArray[j];
                    nonSortedArray[j] = temp;
                    sortedArray = nonSortedArray;
                }
            }
        }
        return sortedArray;
    }

    /**
     * Method remove all odd integers from given int array
     * @param ints
     * @return only even integers
     */
    //nieparzyste
    public int[] removeOdd (int... ints){
        int[] tempInts = new int[ints.length];
        int tempLength = 0;
        for (int anInt : ints) {
            if (anInt%2==0){
                tempInts[tempLength] = anInt;
                tempLength++;
            }
        }
        int[] onlyEven = new int[tempLength];
        for (int i = 0; i < tempLength; i++) {
            onlyEven[i] = tempInts[i];
        }
        return onlyEven;
    }

    /**
     * Method generate string array from int array
     * @param intArray
     * @return string array
     */
    public String[] convertToStringArray(int[] intArray){
        String[] stringArray = new String[intArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = String.valueOf(intArray[i]);
        }
        return stringArray;
    }

    /**
     * Method generate string array from string, every single word will be separated element of array
     * @param textArray
     * @return string array
     */
    public String[] stringToArray(String textArray){
        return textArray.split(" ");
    }

}

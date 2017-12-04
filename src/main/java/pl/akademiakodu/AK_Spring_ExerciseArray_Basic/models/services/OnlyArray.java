package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services;

import org.springframework.stereotype.Service;

@Service
public class OnlyArray {

    public int maxOf(int[] intArray){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]>max){
                max=intArray[i];
            }
        }
        return max;
    }

    public int minOf(int... ints){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]<min){
                min=ints[i];
            }
        }
        return min;
    }

    public double averageOf(int... ints){
        double sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum+=ints[i];
        }
        return (double)((int)((sum/ints.length)*100))/100;
    }

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

    public String[] convertToStringArray(int[] intArray){
        String[] stringArray = new String[intArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = String.valueOf(intArray[i]);
        }
        return stringArray;
    }

    public String[] stringToArray(String textArray){
       return textArray.split(" ");
    }


}

package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services;

/**
 * interface here to show one of interface util
 */
public interface InputToArray {
    /**
     * Method replace String if possible to string array splited by comas
     * @param userInput as String
     * @return string array
     */
    String[] toArray(String userInput);

    /**
     * Method will replace String array into Integer array if possible
     * @param stringArray
     * @return integer array
     */
    int[] generateIntArray(String[] stringArray);
}

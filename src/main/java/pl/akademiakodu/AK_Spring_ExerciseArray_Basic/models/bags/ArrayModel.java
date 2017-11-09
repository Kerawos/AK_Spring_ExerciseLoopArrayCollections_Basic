package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.bags;

public class ArrayModel {

    int[] intArray;
    String[] stringArray;

    public ArrayModel() {
    }

    public ArrayModel(int[] intArray) {
        this.intArray = intArray;
    }

    public ArrayModel(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }
}

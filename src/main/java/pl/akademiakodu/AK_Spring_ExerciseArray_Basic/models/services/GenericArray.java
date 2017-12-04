package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services;

/**
 * Inport section
 */
import org.springframework.stereotype.Service;

/**
 * Responsible for managing integer or string arrays
 * @param <type>
 */
@Service
public class GenericArray<type>{

    private type[] array;

    public GenericArray(type[] array) {
        this.array = array;
    }

    public GenericArray() {
    }

    public type[] getArray() {
        return array;
    }

    public void setArray(type[] array) {
        this.array = array;
    }


}

package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models;

/**
 * Imports section
 */
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services.OnlyLoop;

import static org.junit.Assert.*;

/**
 * Testing loop services
 */
public class OnlyLoopTest {

    /**
     * Declaration of services
     */
    private static OnlyLoop onlyLoop;

    @BeforeClass public static void start(){
        onlyLoop = new OnlyLoop();
    }

    @AfterClass public static void stop(){
        onlyLoop = null;
    }

    /**
     * This method test all usable array services
     */
    @Test public void testingLoopServices(){
        assertEquals("Hello World, Hello World, Hello World, Hello World, Hello World, ", onlyLoop.print5TimesHelloWorld());
        assertEquals("15, 14, 13, 12, 11, 9, 8, ", onlyLoop.printDigitsFrom8To15Without10());
        assertEquals("1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, ", onlyLoop.printFirst12OddDigits());
        assertEquals("***---******---******---***", onlyLoop.print3SOS());
        assertEquals("120", onlyLoop.factorialOf5());
    }

    /**
     * This method test random generator
     */
    @Test public void testLotto(){
        String userData = onlyLoop.generate6LottoDigits();
        String[] userDataStrings = userData.split(",");
        int[]userDataInts = new int[6];
        for (int i = 0; i < userDataInts.length; i++) {
            assertNotNull(userDataStrings[i]);
            userDataStrings[i] = userDataStrings[i].trim();
            userDataInts[i] = Integer.parseInt(userDataStrings[i]);
            assertTrue(userDataInts[i]>=1);
            assertTrue(userDataInts[i]<=49);
        }
    }

}
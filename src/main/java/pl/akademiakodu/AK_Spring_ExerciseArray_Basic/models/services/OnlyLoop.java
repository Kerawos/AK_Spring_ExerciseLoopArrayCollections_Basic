package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services;

/**
 * Import section
 */
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Responsible for loop calculations and exercise
 */
@Service
public class OnlyLoop {

    private StringBuilder sb;

    /**
     * Method adding 5 times listed word
     * @return result of 5 listed word: 'Hello World, Hello World, Hello World, Hello World, Hello World, '
     */
    public String print5TimesHelloWorld(){
        sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            sb.append("Hello World, "); // adding String "hello world" like 'System.out.println("hello world")'
        }
        return sb.toString();
    }

    /**
     * Method gathering all digits from 15 to 8 (all included) without digit 10.
     * @return string output '15, 14, 13, 12, 11, 9, 8'
     */
    public String printDigitsFrom8To15Without10(){
        sb = new StringBuilder();

        for (int i = 15; i >= 8 ; i--) {
            if (i==10){
                continue;
            }
            sb.append(i + ", ");
        }
        return sb.toString();
    }

    /**
     * Method will gather first 12 odd digits
     * @return string output '1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, '
     */
    public String printFirst12OddDigits(){
        sb = new StringBuilder();
        for (int i = 0; i < 24; i++) {
            if (i%2!=0){
                sb.append(i+", ");
            }
        }
        return sb.toString();
    }

    /**
     * Method will gather proper SOS signal. One part of signal is: '***---***'
     * @return string as signal: '***---******---******---***'
     */
    public String print3SOS(){
        sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < 27; i++) {
            if (counter<3 || counter>5){
                sb.append("*");
            } else {
                sb.append("-");
            }
            if (counter>8){
                counter=0;
            }
            counter++;
        }
        return sb.toString();
    }


    /**
     * Method will calculate factorial of digit 5
     * @return digit: 120
     */
    public String factorialOf5(){
        sb = new StringBuilder();
        int result = 1;
        for (int i = 2; i <= 5; i++) {
            result*=i;
        }
        sb.append(result);
        return sb.toString();
    }

    /**
     * Method generate 6 times random unique digit between 1-49
     * @return random 6 digit
     */
    public String generate6LottoDigits(){
        sb = new StringBuilder();
        Random random = new Random();
        int[]temp = new int[6];
        for (int i = 0; i <= 5; i++) {
            int rnd = random.nextInt(49-1)+1;
            sb.append(rnd + ", ");
            temp[i] = rnd;
            if (i>0){
                for (int j = i-1; j > 0 ; j--) {
                    if (temp[j]==temp[i]){
                        sb = new StringBuilder();
                        i=-1;
                        break;
                    }
                }
            }

        }
        return sb.toString();
    }

}

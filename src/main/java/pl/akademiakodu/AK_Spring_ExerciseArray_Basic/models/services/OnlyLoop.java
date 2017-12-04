package pl.akademiakodu.AK_Spring_ExerciseArray_Basic.models.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OnlyLoop {

    private StringBuilder sb;

    //task1:
    public String print5TimesHelloWorld(){
        sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            sb.append("Hello World, "); // adding String "hello world" like 'System.out.println("hello world")'
        }
        return sb.toString();
    }


    // task2: from 15 to 8 without 10
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

    //task3:
    public String printFirst12OddDigits(){
        sb = new StringBuilder();
        for (int i = 0; i < 24; i++) {
            if (i%2!=0){
                sb.append(i+", ");
            }
        }
        return sb.toString();
    }

    //task4: sos signal is" ***---***
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

    //task5: factorial from 5
    public String factorialOf5(){
        sb = new StringBuilder();
        int result = 1;
        for (int i = 2; i <= 5; i++) {
            result*=i;
        }
        sb.append(result);
        return sb.toString();
    }

    //task6: take 6 random digits (from 1 to 49)
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

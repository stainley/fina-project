package edu.lambton.exercise1;

import java.util.Arrays;

public class ArrayExercise {

    public void sortNumericString() {
        int[] arrNumber = { 8, 3, 10, 12, 6, 5};
        Arrays.toString(arrNumber);
        Arrays.sort(arrNumber);

        for(int a : arrNumber) {
            System.out.println(a);
        }

    }
}

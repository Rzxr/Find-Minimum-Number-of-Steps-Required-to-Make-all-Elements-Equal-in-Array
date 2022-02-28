package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Finds the min number of steps needed by making all elements equal according to the middle element when the array is sorted
        int[] numArray = {3, 2, 1, 1, 2, 3, 1} ;
        int mid = numArray[numArray.length / 2];

        System.out.println(mid);
        Arrays.sort(numArray);

        int steps = 0;
        for(int i : numArray) {
            steps = steps + Math.abs(mid - i);
        }
        System.out.println(steps);
    }
}

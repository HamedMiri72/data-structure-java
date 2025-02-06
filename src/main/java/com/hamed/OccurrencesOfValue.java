package com.hamed;

import java.util.Arrays;

public class OccurrencesOfValue {
    public static void main(String[] args){

        int[] numbers = {5, 3, 7, 3, 8, 3, 1, 3};

        int target = 3;
        int count = 0;

        for (int number: numbers){
            if(number == target){
                count++;
            }
        }

        System.out.println(target + " appears " + count + " times in the Array! ");
        System.out.println(Arrays.toString(numbers));
    }
}

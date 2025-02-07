package com.hamed;

import java.util.Arrays;

public class RemoveFromArray {

    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        int[] newArray = new int[numbers.length -1];
        int index = 0;


        for (int i=0; i < numbers.length; i++){
            if(numbers[i] != target){
                newArray[index] = numbers[i];
                index++;
            }
        }

        System.out.println("Array after removin: " + Arrays.toString(newArray));

    }
}

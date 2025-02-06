package com.hamed;

public class LargeAndSmallNumber {


    public static void main(String[] args){
        int[] numbers = {15, 42, 8, 23, 99, 4};

        int min = numbers[0];
        int max = numbers[0];

        for (int i=0; i < numbers.length ; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }

            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}

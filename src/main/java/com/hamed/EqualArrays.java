package com.hamed;

import java.util.Arrays;

public class EqualArrays {

    public static void main(String[] args){

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 4, 3, 2, 1};

        System.out.println(Arrays.equals(array1, array2));
        System.out.println(Arrays.equals(array1,array3));
    }
}

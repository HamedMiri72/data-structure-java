package com.hamed;

public class SearchForElement {

    public static void main(String[] args){

        int[] numbers = {10, 20, 30, 40, 50};

        int target = 30;
        boolean found = false;



//        for(int number : numbers){
//            if(number == target){
//                found = true;
//                break;
//            }
//        }

        for(int i=0 ; i < numbers.length; i++){

            if(numbers[i] == target){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println(target + " is in the Array");
        } else{
            System.out.println(target + "is not in the array");
        }
    }
}

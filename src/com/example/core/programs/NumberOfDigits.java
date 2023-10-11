package com.example.core.programs;

public class NumberOfDigits {
    public static void main(String[] args) {
        int number = 4536, count = 0;

        while(number != 0){

            number = number / 10;
            count++;
        }
        System.out.println("The number of digits in the given number are: "+count);

    }
}

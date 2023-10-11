package com.example.core.programs;

public class Factors {
    public static void main(String[] args) {
        int number = 40, divisor = 1;

        System.out.println("The Factors of "+number+" are: ");

        while(number >= divisor){
            if (number % divisor == 0)
                System.out.println(divisor);

            divisor++;
        }
    }
}

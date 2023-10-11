package com.example.core;

import java.sql.SQLOutput;

public class ConditionsDemo {

    public static void main(String[] args) {
        boolean flag = true;

        int number = 45;

        int reminder = number % 2;


        // Conditional Operators == != > < <= >=
        if(reminder == 0) {
            System.out.println("NUMBER IS EVEN");
        }
        else{
            System.out.println("NUMBER IS ODD");
        }
    }
}

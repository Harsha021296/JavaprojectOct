package com.example.core.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseNumbers {
    public static void main(String[] args) {
        int[] num = {12, 64, 23, 35,2, 67, 9, 11};
        int position = 0;

        for(position = num.length-1; position >= 0; position--){
            System.out.println("Number at position: "+position+" is - "+num[position]);
            //position++;
        }

    }
}

package com.example.core.programs;

public class HighestAndLowestNumber {
    public static void main(String[] args) {

        int arr[] = {1, 15, -1, 23, 45, 70, 99, -13, -5};

        int highest = arr[0];
        int lowest = arr[0];
        int i = 1;

        while(i < arr.length){
            int num = arr[i];

            if(num>highest)
                highest = num;

            else if(num<lowest)
                lowest = num;

            i++;
        }

        System.out.println("The Highest Number is: "+highest);
        System.out.println("The Lowest Number is: "+lowest);

        int diff = highest-lowest;
        System.out.println("The Difference between Highest and Lowest Number is: "+diff);
    }
}

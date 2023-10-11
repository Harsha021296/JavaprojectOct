package com.example.core.programs;

public class AverageNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int i = 0, sum = 0;

        while(i < arr.length){
            sum = sum + arr[i];
            i++;
        }

            double average = (double) sum / i;
            System.out.println("The Average of the array is: " + average);

    }
}

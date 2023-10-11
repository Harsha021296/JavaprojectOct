package com.example.core.programs;

public class EvenPosition {
    public static void main(String[] args) {
        int[] arr = {34, 67, 81, 97, 45, 54, 90, 83};
        int num = 1;

        System.out.println("The numbers in even position are: ");

        while(num < arr.length){
            System.out.println(arr[num]);
            num = num + 2;
        }
    }
}

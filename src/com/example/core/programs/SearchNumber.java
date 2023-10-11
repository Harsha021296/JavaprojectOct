package com.example.core.programs;

public class SearchNumber {
    public static void main(String[] args) {
        int[] arr = {34, 67, 81, 97, 45, 54, 90, 83};
        int i=1;
        boolean found = false;
        int target = 67;

        while(i<arr.length){
            int num=arr[i];

            if (num == target) {
                found = true;
                // break;
            }
            i++;
            break;
        }

        if(found == true) {
            System.out.println("The Given Number " + target + " is present in the list.");
            System.out.println("The position if the Search number is: " +i);
        }
        else
            System.out.println("The Given Number "+target+" is not present in the list.");


    }
}

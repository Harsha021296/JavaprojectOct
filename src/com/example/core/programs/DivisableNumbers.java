package com.example.core.programs;

public class DivisableNumbers {
    public static void main(String[] args) {
        int[] arr = {34, 67, 81, 97, 45, 54, 90, 83};
        int i=0, two = 0, three = 0, five = 0;

        while(i < arr.length) {
            int num = arr[i];

            if (num % 2 == 0)
                two++;

            if (num % 3 == 0)
                three++;

            if (num % 5 == 0)
                five++;

            i++;
        }

        System.out.println("Numbers divisible by 2: "+two);
        System.out.println("Numbers divisible by 3: "+three);
        System.out.println("Numbers divisible by 5: "+five);

    }
}

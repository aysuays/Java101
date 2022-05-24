package com.patika.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMinMAx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How may values you want to copare? :");
        int n = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter " + (i + 1) + ". value :");
            array[i] = input.nextInt();
            input.nextLine();
        }

        for (int i = 0; i < n-1; i++) {
            if (array[i] > array[i + 1]) {
                int temp1 = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp1;
            }
        }

        System.out.println("Min value of the array" + array[0]);
        System.out.println("Max value of the array" + array[n - 1]);


    }
}


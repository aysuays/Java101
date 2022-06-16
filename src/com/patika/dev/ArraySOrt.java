package com.patika.dev;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySOrt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length of the array");
        int a = input.nextInt();

        int[] intArray = new int[a];

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Please enter " + (i + 1) + ". element in the array :");
            int b = input.nextInt();
            intArray[i] = b;
        }

        System.out.println("Original array: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.println(intArray[i] + " ");
        }

        int temp;

        for (int i = 0; i <intArray.length; i++) {
            for (int j = i+1; j <intArray.length; j++) {
                if(intArray[i] >intArray[j]) {      //swap elements if not in order
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");



        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " ");
        }

    }
}

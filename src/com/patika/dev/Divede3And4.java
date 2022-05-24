package com.patika.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divede3And4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int valuee, total = 0, counter = 0;
        float avg;


        System.out.println("Please enter an positive integer :");
        valuee = input.nextInt();

        for (int i = 1; i <= valuee; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                counter++;
                System.out.println(i);
            }
        }

        avg = total / counter;

        System.out.println("Avarage :" + avg);


    }
}

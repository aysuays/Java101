package com.patika.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1)
                + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Plase enter a value for Fibonacci? :");
        int n = input.nextInt();

        // Given Number N

        // Print the first N numbers
        for (int i = 0; i < n; i++) {

            System.out.print(fib(i) + " ");
        }


    }
}

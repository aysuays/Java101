package com.patika.dev;

import java.util.Scanner;

public class Combination {

    int N, r, nFactorial, rFactorial, nrFactorial, combination;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Combination com1 = new Combination();
        System.out.println("Please enter a value (N) :");
        com1.N = input.nextInt();

        System.out.println("Please enter a value (r):");
        com1.r = input.nextInt();

        int divide = (com1.Factoriall(com1.r) * com1.Factoriall(com1.N - com1.r));
        System.out.println(divide + "divide");
        if (divide != 0) {
            com1.combination = com1.Factoriall(com1.N) / divide;
        }


        System.out.println("Result:" + com1.combination);


    }

    public int Factoriall(int value) {
        int total = 1;
        for (int i = 1; i <= value; i++)
            total = total * i;
        return total;
    }
}

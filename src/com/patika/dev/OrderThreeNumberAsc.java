package com.patika.dev;

import java.util.Scanner;

public class OrderThreeNumberAsc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("Please enter the first value : ");
        a = input.nextInt();

        System.out.println("Please enter the second value : ");
        b = input.nextInt();

        System.out.println("Please enter the third value : ");
        c = input.nextInt();

        if (a < b && b < c) {
            System.out.println("a < b <c");
        }
        else if (a < b && c < b) {
            if (a < c) {
                System.out.println("a < c < b");
            } else
                System.out.println("c < a < b");

        }
        else if (c < b && b < a) {
            System.out.println("c<b<a");
        }
        else if (c < b && a < b) {
            if (a < c)
                System.out.println("a<c<b");
            else
                System.out.println("c<a<b");
        }
        else if (b < a && a < c) {
            System.out.println("b<a<c");
        }
        else if (b < a && c < a) {
            if (b < c)
                System.out.println("b<c<a");
            else
                System.out.println("c<b<a");
        }


    }
}

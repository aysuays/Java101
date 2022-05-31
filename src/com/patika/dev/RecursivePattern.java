package com.patika.dev;

import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int n = scan.nextInt();

        int temp1 = n;

        subst(n);


    }

    static void subst(int n ){
        int temp1=n;
        if( n !=0 && n>0  ){
            n -=5;
            System.out.println(n);
            subst(n);
        }
        else if(n>=temp1) {
            n = n + 5;
            System.out.println(n);
            subst(n);
        }


    }

}
package com.patika.dev;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.println("Please enter the year that you wanna check if it is leap year:");
        year = input.nextInt();
        if (year % 100 == 0 && year % 400 ==0 ) {
            System.out.println("It is a leap year");
        }
        else if ( year % 100 != 0 ){
            if( year % 4 == 0 )
                System.out.println("It is a leap year");
            else
                System.out.println("It is not a leap year");
        }
        else{
            System.out.println("It is NOT a leap year");

        }

    }
}
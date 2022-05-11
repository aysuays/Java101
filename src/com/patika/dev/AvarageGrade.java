package com.patika.dev;
import java.util.Scanner;

public class AvarageGrade {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int math, physics , chemical , music, turkish , history;

        Scanner input= new Scanner(System.in);


        System.out.println("Please enter Math Grade: ");
        math  = input.nextInt();

        System.out.println("Please enter Physics Grade: ");
        physics  = input.nextInt();

        System.out.println("Please enter Chemical Grade: ");
        chemical  = input.nextInt();

        System.out.println("Please enter Music Grade: ");
        music  = input.nextInt();

        System.out.println("Please enter Turkish Grade: ");
        turkish  = input.nextInt();

        System.out.println("Please enter History Grade: ");
        history  = input.nextInt();

        float avarage= (math + physics + chemical + music + turkish + history)/6;

        System.out.println("Your avarage grade :"+ avarage);

        if(avarage>60)
            System.out.println("You passed the class");
        else
            System.out.println("You failed the class");


    }

}

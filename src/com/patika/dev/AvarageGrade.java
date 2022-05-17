package com.patika.dev;
import java.util.Scanner;

public class AvarageGrade {

    int math, physics , chemical , music, turkish , history;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input= new Scanner(System.in);

        try{
            AvarageGrade grade = new AvarageGrade();
            System.out.println("Please enter Math Grade: ");
            grade.math  = input.nextInt();
            grade.checkFor(grade.math);

            System.out.println("Please enter Physics Grade: ");
            grade.physics  = input.nextInt();
            grade.checkFor(grade.physics);

            System.out.println("Please enter Chemical Grade: ");
            grade.chemical  = input.nextInt();
            grade.checkFor(grade.chemical);

            System.out.println("Please enter Music Grade: ");
            grade.music  = input.nextInt();
            grade.checkFor(grade.music);

            System.out.println("Please enter Turkish Grade: ");
            grade.turkish  = input.nextInt();
            grade.checkFor(grade.turkish);

            System.out.println("Please enter History Grade: ");
            grade.history  = input.nextInt();
            grade.checkFor(grade.history);

            float avarage= (grade.math + grade.physics + grade.chemical + grade.music + grade.turkish + grade.history)/6;

            System.out.println("Your avarage grade :"+ avarage);

            if(avarage>60)
                System.out.println("You passed the class");
            else
                System.out.println("You failed the class");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public int checkFor(int grade){
        if (grade < 0 || grade > 100)
            return 0;
        else
            return grade;
    }

}

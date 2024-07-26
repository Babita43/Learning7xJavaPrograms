package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

import java.util.Scanner;

public class PositiveNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");


        }
    }
}
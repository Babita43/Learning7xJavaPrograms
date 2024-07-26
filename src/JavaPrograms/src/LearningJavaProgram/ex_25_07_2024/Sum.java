package JavaPrograms.src.LearningJavaProgram.ex_25_07_2024;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b= sc.nextInt();

        System.out.println("Sum of 2 nos is :" +(a+b));
        System.out.println("Sub of 2 nos is :"+(a-b));
        System.out.println("Multiplication of 2 nos is :"+(a*b));
        System.out.println("Divide of 2 nos is :"+(a/b));
        System.out.println("Division of 2 nos is :"+(a%b));

    }
}

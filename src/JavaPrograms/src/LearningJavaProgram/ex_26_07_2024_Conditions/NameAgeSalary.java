package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NameAgeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("My name is : " + name);
        System.out.println("My age is : " + age);
        System.out.println("My salary is : " + salary);
    }
}

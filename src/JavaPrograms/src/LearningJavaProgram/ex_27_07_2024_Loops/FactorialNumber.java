package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for factorial : ");
        int num = sc.nextInt();

        int fact =1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

package JavaPrograms.src.LearningJavaProgram.ProgramsToPractice;

import java.util.Scanner;

public class CountOccurnaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        //int num = 12454;
        int temp = 0;

        while(num>0) {
            if (num % 10 == 4) {
                temp = temp + 1;
            }
            num = num / 10;
        }
        System.out.println(temp);

    }
}

package JavaPrograms.src.LearningJavaProgram.ProgramsToPractice;

import java.util.Scanner;

public class PrimeNoCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check it is prime or not : ");
        int num = sc.nextInt();
        //Prime no is divisible by 1 and itself only
        //if no divide other than itself then it is not prime no
        //suppose we check 7 is prime or not, we will start to divide it with 2 to less than the number itself 6

        int c = 2;
        boolean isprime = true;
        while (c < num) {
            if (num % c == 0) {
                System.out.println(num + " is  not prime");
                isprime = false;
                break;
            }
            c++;
        }
        if (isprime) {
            System.out.println(num + " is a prime number.");
        }
    }
}

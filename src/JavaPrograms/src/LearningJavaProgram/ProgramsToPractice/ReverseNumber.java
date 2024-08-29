package JavaPrograms.src.LearningJavaProgram.ProgramsToPractice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse : ");
        int num = sc.nextInt();
        int ans = 0;

        while(num>0) {  // here we will use no of digits
           int rem = num % 10;
            num = num / 10;
           ans = ans*10+rem;
        }
        System.out.println(ans);

        String s= "Abhinav";
        StringBuilder sb = new  StringBuilder(s);
        System.out.println(sb.reverse().toString());
    }
}

package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

import java.util.Scanner;

public class StringNextLineIssue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter i  value :");
        int i = sc.nextInt();
        System.out.println("Enter d value :");
        double d = sc.nextDouble();
        System.out.println("Enter string  value :");
        /*When you use methods like nextInt() and nextDouble() from the Scanner class, they read the number but leave the newline character (\n) in the input buffer.
        This leftover newline character causes problems when you later use nextLine(), which reads the entire line of input.
       ** Suppose the user enters 3.14 and presses Enter. nextDouble() reads 3.14 and stops at the newline character.
          The input buffer again contains just the newline character (\n).
          When we call nextLine(), it reads everything up to the next newline character. Since the input buffer already contains a newline character from the previous input,
          nextLine() immediately returns an empty string and doesn't wait for user input.*/
        sc.nextLine();// consume the remaining newline character
        //To overcome above problem this is used
        String s1 = sc.nextLine();
        // here I have used next line() to print all line .with next() it prints only the sequence of character if whitespace comes it stops
        System.out.println("int : " + i);
        System.out.println("double : " + d);
        System.out.println("String : " + s1);
    }
}

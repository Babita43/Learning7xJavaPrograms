package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Constructor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankAccountObjectWIthScanner {
    public static void main(String[] args) {
        BankAccountClass ba1 = new BankAccountClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bank name");
        String banknameis = sc.next();
        System.out.println("Enter  the code");
        int codeis = sc.nextInt();
        System.out.println("Enter the account no");
        String accountNo = sc.next();
        BankAccountClass ba2 = new BankAccountClass(banknameis, codeis, accountNo);
        ba2.PrintDetails();
    }
}

package JavaPrograms.src.LearningJavaProgram.ProgramsToPractice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //Armstrong no is 153 and 370 if we cube all 3 and add them then it is sam 153
        //1^3 + 5^3 +3^3 =1+125+21 =153

        Scanner sc = new Scanner(System.in);
        int orignal_num = sc.nextInt();
        int num=orignal_num;
        int sum = 0;
        while(num>0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
        }
        if(sum==orignal_num){
            System.out.println(sum + "  It is armstrong number" );
        }else{
            System.out.println(" it is not armstrong no");
        }
    }
}


package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

import java.util.Scanner;

public class Modulous {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        System.out.println("Enter the num1 : ");
        int num1 =sc.nextInt();
      //  ****** check no is odd or even
        if(num%2==0){
            System.out.println("it is even number : "+ num);
        }else{
            System.out.println("it is odd number : "+ num);
        }
        // check no is geater or not
        if(num>num1){
            System.out.println("num is greater");
        }else if (num<num1){
            System.out.println("num is smaller");
        }else{
            System.out.println("nos are equal");
        }
    }
}

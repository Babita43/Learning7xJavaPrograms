package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number a : ");
        int a = sc.nextInt();
        System.out.println("Enter number b : ");
        int b = sc.nextInt();
        System.out.println("Enter number c : ");
        int c = sc.nextInt();

        int max = a;

if(b>max){
    max=b;

}
        if (c > max) {
            max =c;

        }
           System.out.println("Largest no is : " + max);


//        if(a>b&&a>c){
//            System.out.println("a is max");
//        }
//        else if(b>a&&b>c){
//            System.out.println("b is max");
//        }else{
//            System.out.println("c is max");
//        }
    }
}

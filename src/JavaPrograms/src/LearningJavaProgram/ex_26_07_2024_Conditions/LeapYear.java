package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

import java.util.Scanner;

import static java.lang.System.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("it is leap : "+ year);
        }else{
            System.out.println("it is not leap : "+ year);

        }

    }
}

package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DaysSwitchCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number 1-7 , I will tell you day on it : ");
        int day = sc.nextInt();

        switch(day){
            case 1 :
                System.out.println( "Today is Monday");
                break;
                case 2 :
                System.out.println( "Today is Tuesday");
                    break;
                case 3 :
                System.out.println( "Today is Wednesday");
                    break;
                case 4 :
                System.out.println( "Today is Thursday");
                    break;
                case 5 :
                System.out.println( "Today is Friday");
                    break;
                case 6 :
                System.out.println( "Today is Saturday");
                    break;
                case 7 :
                System.out.println( "Today is Sunday");
            default:

                System.out.println( "Oops");

        }
        System.out.println("I am outside the loop after printing the day :)");
    }
}

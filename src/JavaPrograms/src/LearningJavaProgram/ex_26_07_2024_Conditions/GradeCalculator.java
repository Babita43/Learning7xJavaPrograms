package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
     /*   what should be the datatype int
        what should be the return type char
        input score
        90-100 A
        80-89 b
        70-79 c
        60-69 d
        50-59 e
        0-49 f*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score of student : ");
        int score = sc.nextInt();
        char grade ='F';
        if(score>= 90 && score <=100){
            grade ='A';
         //   System.out.println("Grade: A");
        }else if(score>80 && score<89){
            grade ='B';
        }else if(score>70 && score<79){ //We use && when all conditions are true
                grade= 'C';
            }else if(score>60 && score<69){
                grade= 'D';
            }else if(score>50 && score<59){
                grade= 'E';
            }else if(score<0 || score>100){   // here we used || , we use OR if atleast one condition is true
            System.out.println("lol");
            }
        else{
            grade= 'F';
        }

        System.out.println( "Your Grade is :"+ grade);
        sc.close();
        /*Note :
        When to use &&
                When you want to check if multiple conditions are all true.
                When all conditions must be met for the action to be performed.
                When to use ||
        When you want to check if at least one of several conditions is true.
                When any one of the conditions being true is sufficient for the action to be performed.
                */
    }
}

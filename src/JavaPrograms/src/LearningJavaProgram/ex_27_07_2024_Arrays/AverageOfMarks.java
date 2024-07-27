package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

import java.util.Scanner;

public class AverageOfMarks {
    public static void main(String[] args) {
       float marks[] = new float[5];
        Scanner sc = new Scanner(System.in);
       for(int i=0; i<marks.length;i++){
            System.out.println("Enter marks for subjec :" + i);
            marks[i] =sc.nextFloat();
        }
        float total = 0;

       for(int j=0; j< marks.length;j++)
{

        total =total+marks[j];

    }

//float average = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/ marks.length;

float average = total/marks.length;



            System.out.println( "Average of Subjects is " + average);

    }
}

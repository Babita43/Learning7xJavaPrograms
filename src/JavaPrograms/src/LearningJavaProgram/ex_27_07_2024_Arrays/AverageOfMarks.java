package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

import java.util.Scanner;

public class AverageOfMarks {
    public static void main(String[] args) {
       // program to take input of 5 subjects marks and find out average
        float marks[] = new float[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks for subject " + (i +1) +":");
            marks[i] = sc.nextFloat();
            }

        float average = (marks[0] +marks[1]+marks[2] +marks[3]+marks[4])/5;
        System.out.println(average);
//        float average =0;
//        for (int j = 0; j < marks.length; j++) {
//           average = average+marks[j];
//        }
//        System.out.println(average/5);

    }
}
    
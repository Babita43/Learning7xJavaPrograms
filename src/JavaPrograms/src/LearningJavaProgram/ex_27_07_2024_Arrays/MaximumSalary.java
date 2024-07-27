package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSalary {
    public static void main(String[] args) {
        int salary[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i< salary.length;i++) {
            System.out.println("Salary of employee " + (i + 1) + "=");
            salary[i] = sc.nextInt();
        }
            int max=0;
            for(int j=0;j< salary.length;j++)
            if(salary[j]>max) {
                max = salary[j];
            }
        System.out.println(max);

        int min =salary[0];
        for(int k=0; k<salary.length;k++)
            if(min>salary[k]){
                min= salary[k];
            }

        System.out.println(min);

            //ny sorting numbers in ascending order ,select the last number
//        Arrays.sort(salary);
//        System.out.println(salary[salary.length-1]);
    }
}

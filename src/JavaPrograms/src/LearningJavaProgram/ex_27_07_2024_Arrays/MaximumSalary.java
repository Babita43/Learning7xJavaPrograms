package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSalary {
    public static void main(String[] args) {
//        int salary[]=new int[5];
//        Scanner sc= new Scanner(System.in);
//        for(int i=0; i< salary.length;i++) {
//            System.out.println("Salary of employee " + (i + 1) + "=");
//            salary[i] = sc.nextInt();
//        }

        int salaries[] = {45, 87, 65, 40, 88};
        int max = 0;
        int secondMax =0;
       int thirdMax=0;
        for (int i = 0; i < 5; i++) {
            if (salaries[i] > max) {
                thirdMax=secondMax;
                secondMax=max;
                 max= salaries[i];
            }
        }
        System.out.println("Maximum salary is : " +max);

        System.out.println("Second max : " + secondMax);
        System.out.println("Third max : "+thirdMax);

//        Arrays.sort(salaries);
//        System.out.println("Maximum Salary sorting : " +salaries[salaries.length-1]);
//        System.out.println("second Highest Salary sorting : " + salaries[salaries.length-2]);

        int min = salaries[0];
        for (int j = 0; j < salaries.length; j++) {
            if(salaries[j]<min){
               min=salaries[j];
            }
        }
        System.out.println("Minimum Salary is : "+min);

    }
}

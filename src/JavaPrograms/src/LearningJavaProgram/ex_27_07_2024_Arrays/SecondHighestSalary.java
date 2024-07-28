package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

import java.util.Scanner;

public class SecondHighestSalary {
    public static void main(String[] args) {
        int salary[] = new int[5];

Scanner sc = new Scanner(System.in);

for(int i=0;i<salary.length;i++){
    System.out.println("Enter the number : ");

    salary[i]=sc.nextInt();
}

int max= 0;
for(int j=0;j< salary.length;j++){
    if(salary[j]>max){
        max =salary[j];
    }
}
        System.out.println("the max no is : " + max);

        }
    }

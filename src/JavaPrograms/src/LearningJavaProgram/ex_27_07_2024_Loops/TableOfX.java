package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Loops;

import java.util.Scanner;

public class TableOfX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for table : ");
        int table = sc.nextInt();
        for(int i = 1; i<=10;i++){
            int j =table * i;
            System.out.println(""+ table + "*" + i + "=" +j);
        }
    }
}

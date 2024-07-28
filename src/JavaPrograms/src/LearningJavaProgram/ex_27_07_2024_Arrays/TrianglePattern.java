package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }

            System.out.println("");
        }


        for (int rowA = 0; rowA < n; rowA++) {
            for (int colA = n; colA > rowA; colA--) {
                System.out.print("*");
            }

            System.out.println("");
        }



    }
}

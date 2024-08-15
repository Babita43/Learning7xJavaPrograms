package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        String[] milkProducts ={"curd", "milk", "cheese"};  // initialising and declaring array
        String toys[]= new String[5];

        toys[0] = "bat";
        toys[1] = "ball";
        toys[2] = "badminton";
        toys[3] = "shuttle";
        toys[4] = "football";
        System.out.println(toys[3]);
        System.out.println(toys[0]);
        System.out.println(milkProducts.length);
        System.out.println(milkProducts[2].indexOf('e'));

        int[] marks = new int[4];
        System.out.println(marks[1]); // it will show 0 default value of integer because value is not assigned on indexes
        System.out.println(marks[0]);
        System.out.println(marks[2]);
        marks[1]= 100;
        marks[0]= 200;
        marks[2]= 300;
        marks[3]= 400;

    for(int i= 0; i< marks.length;i++){
        System.out.println(marks[i]);
    }
        char grades[] = new char[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Print array at 0 index : "  );
        grades[0] = sc.next().charAt(0);
        System.out.println("Print array at 1 index : "  );
        grades[1] = sc.next().charAt(0);
        System.out.println("Print array at 2 index : "  );
        grades[2] = sc.next().charAt(0);
        System.out.println("Print array at 3 index : "  );
        grades[3] = sc.next().charAt(0);

        System.out.println(grades.length);
        System.out.println(grades[3]);
        System.out.println("Arrays grade list is : " + Arrays.toString(grades));
        // it is used to print the entire array to verify the input

        int num[] = {10, 20,30,40};
        for(int i=0; i<num.length;i++){
            System.out.println("Output of num  is " + num[i]*2);
        }

    }
}

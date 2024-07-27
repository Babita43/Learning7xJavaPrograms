package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

import java.util.Scanner;

public class ListOfArray {
    public static void main(String[] args) {
        int num[] = {12, 45, 65, 54, 87};
        System.out.println(num.length);   // it shows total length of array
        System.out.println(num[3]);    // it shows num available in given index
        //   System.out.println(num[10]);   ArrayIndexOutOfBoundException
        //Array with new keyword
        System.out.println("********************************");
        int list[] = new int[6]; //0-5
        System.out.println(list[3]);  //default value of int is 0 if not mentioned
        Scanner sc = new Scanner(System.in);
        list[0] = 54;
        list[1] = 52;
        list[2] = 54;
        System.out.println(list[1]);

        System.out.println("Enter value of index 3 :");
        list[3] = sc.nextInt();
        System.out.println("Enter value of index 4 :");
        list[4] = sc.nextInt();
        System.out.println("Enter value of index 5 :");
        list[5] = sc.nextInt();

        System.out.println(list[4]);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("********************************");
        String weekdays[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < weekdays.length; i++) {
            System.out.println(i + " is " + weekdays[i]);
        }
    }
}


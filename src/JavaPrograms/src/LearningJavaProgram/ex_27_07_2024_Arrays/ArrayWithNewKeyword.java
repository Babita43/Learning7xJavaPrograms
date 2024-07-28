package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

import java.util.Scanner;

public class ArrayWithNewKeyword {
    public static void main(String[] args) {
        //Another way of array is

        //dataType aarayName = new datatype with array length
        int number[] = new int[4];
        //lenght of array is 4
        // it contains 4 values
        //index start from 0 to 3

        //here value not assigned so it will show default values
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println("**************");
        //assigning the value
//        number[0] = 4;
//        number[1] = 14;
//        number[2] = 40;
//        number[3] = 44;

        //We can add above values using scanner also

        Scanner sc = new Scanner(System.in);
//       number[0] =sc.nextInt();
//       number[1] =sc.nextInt();
//       number[2] =sc.nextInt();
//       number[3] =sc.nextInt();

     //  and traverse it also
           for(int j=0;j< number.length;j++){
               System.out.println("index number is :" + j);
               System.out.println("Enter the number :" + number[j]);
               number[j] = sc.nextInt();
           }
     // here it will print assigned values
//        System.out.println(number[0]);
//        System.out.println(number[1]);
//        System.out.println(number[2]);
//        System.out.println(number[3]);
//        System.out.println("**************");

       // we can traverse with loop
        for(int i=0;i< number.length;i++){
            System.out.println("Printing array value at index : "+ i+ ">> " + number[i]);
        }
        sc.close();
    }
}

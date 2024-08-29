package JavaPrograms.src.LearningJavaProgram.ProgramsToPractice;

import java.util.Arrays;

public class Swapping_Array {
    public static void main(String[] args) {
        int arr[] = {2,5,8,7,9};

        int temp=arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
        System.out.println(Arrays.toString(arr));

//        int a= 10;
//        int b= 30;
//        int c= 45;
//        int d = 67;
//        int temp1 = a;
//        a=c;
//        c=temp1;
//        System.out.println(a);
//        System.out.println(c);
    }
    }


package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Side1 : ");
        int side1 = sc.nextInt();
        System.out.println("Enter value of Side2 : ");
        int side2 = sc.nextInt();
        System.out.println("Enter value of Side3 : ");
        int side3 = sc.nextInt();

//               if(side1==side2 && side2==side3) {
//                   System.out.println("Tiangle is Equilatoral");
//               }else if (side1==side2 && side2!=side3){  // this condition is not right approach , I am foribly set s3 not equql
//            System.out.println("Triangle is isoceles");
//        }else{
//                   System.out.println("Triangle is scalene");
//               }


        if(side1==side2 && side2==side3) {
            System.out.println("Tiangle is Equilatoral");
        }else if (side1==side2 || side2==side3 || side1 == side3)
        {  // this condition is correct approach
            System.out.println("Triangle is isoceles");
        }else{
            System.out.println("Triangle is scalene");
        }


    }
}

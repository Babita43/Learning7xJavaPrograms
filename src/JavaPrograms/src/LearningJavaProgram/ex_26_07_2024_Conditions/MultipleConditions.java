package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

import java.util.Scanner;

public class MultipleConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to check the category :");
        String name = sc.next();

name =name.toLowerCase(); // it is not working

        //its feature after 13 we can list values together as below
        switch (name){
            case "apple", "mango", "banana" :
                System.out.println("these are fruits");
                break;
                case "cabbage", "tomato", "carrot" :

                System.out.println("these are vegetables"); break;

            case "pant", "shirt", "tops" :

                System.out.println("these are clothes"); break;
            default:
                System.out.println("Not fall in these ");

        }

    }
}

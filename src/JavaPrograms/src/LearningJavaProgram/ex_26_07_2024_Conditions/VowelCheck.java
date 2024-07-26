package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vowel : ");
        char vowel = sc.next().charAt(0);

        switch (vowel) {
            case 'a' :
                System.out.println("It is vowel : " + vowel);
                break;
                case 'e' :
                System.out.println("It is vowel : " + vowel);
                break;
                case 'i' :
                System.out.println("It is vowel : " + vowel);break;
                case 'o' :
                System.out.println("It is vowel : " + vowel); break;
            case 'u' :
                System.out.println("It is vowel : " + vowel); break;


            //OR

//            case 'a', 'e','i','o','u' :
//                System.out.println("It is vowel : " + vowel);
//                break;
            default :
                System.out.println("It is consonant" ); break;
        }
    }
}

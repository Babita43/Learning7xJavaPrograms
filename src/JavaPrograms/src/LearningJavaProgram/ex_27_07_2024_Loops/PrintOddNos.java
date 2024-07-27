package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Loops;

public class PrintOddNos {
    public static void main(String[] args) {

        for (int a = 0; a <= 50; a++) {
            if (a % 2 == 0) {

                continue;
            }
            System.out.println(a);
        }
//OR
//it will print odd nos only
        for (int c = 0; c <= 20; c++) {
            if (c % 2 != 0) {

                System.out.println("the number is odd : " + c);
            }
        }

            //It print the even and odd number
            for (int b = 1; b <= 20; b++) {
                if (b % 2 == 0) {

                    System.out.println("The no is even : " + b);
                    continue;
                }
                System.out.println("The no is odd : " + b);
            }
        }
    }


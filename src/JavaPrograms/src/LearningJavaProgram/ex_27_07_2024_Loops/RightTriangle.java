package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Loops;

public class RightTriangle {
    public static void main(String[] args) {

        for(int row=1;row<=5;row++){

            for(int col=1;col<=row;col++) //1<3
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

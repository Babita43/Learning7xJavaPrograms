package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Loops;

public class LeftInvertedPyramid
{
    public static void main(String[] args) {
        int n = 5;
      //  Left Triangle Star Pattern
        for(int row = 1; row <=n;row++){
            for(int col =5;col>=row;col--){
                System.out.print("*");
            }
            System.out.println("");
        }
//Right pyramid
        for(int row = 1; row <=n;row++){
            for(int col =5;col>row;col--){
 System.out.print(" ");
            }
            for(int j=0;j<row;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

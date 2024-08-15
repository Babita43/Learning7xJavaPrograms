package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

public class Array2D {
    public static void main(String[] args) {
        int [][] array2D = {{1,2,3}, {4,5,6}};
        System.out.println("Print the value of 2D array");
        for(int i=0; i< array2D.length;i++){
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

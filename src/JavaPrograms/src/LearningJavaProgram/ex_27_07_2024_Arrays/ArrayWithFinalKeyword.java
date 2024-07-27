package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

public class ArrayWithFinalKeyword {

    public static void main(String[] args) {
        final int flats[] = new int[3]; //with final keyword only the size will be constant not the value thatwe assign
        flats[0] = 87;
        flats[0] = 90; // here we can change the no final will effect for array size
        System.out.println(flats[0]);
    }
}

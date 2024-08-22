package JavaPrograms.src.LearningJavaProgram.ex_17_08_2024_Exceptions;

public class ArgsProgram {
    public static void main(String[] args) {
        String ip = args[2]; // Array index out of bound if args not passed
        int a = Integer.parseInt(ip); // Number format exception it passed args would be string of characters
        int b= 100/a; // if passed arg a = 0, then we will get arithmetic exception
        System.out.println(b);
    }

}

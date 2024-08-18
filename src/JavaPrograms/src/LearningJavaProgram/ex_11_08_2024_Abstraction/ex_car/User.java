package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.ex_car;

public class User {
    public static void main(String[] args) {
        Tesla t = new Tesla();
       t.drive();
        System.out.println("=========================");
       WagonR w = new WagonR();
       w.driver();
    }
}

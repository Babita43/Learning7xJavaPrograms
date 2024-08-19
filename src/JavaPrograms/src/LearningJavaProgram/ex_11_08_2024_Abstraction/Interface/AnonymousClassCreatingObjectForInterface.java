package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.Interface;

public class AnonymousClassCreatingObjectForInterface {
    public static void main(String[] args) {
 //a anonymous class has been
      //  School sc = new School();  // interface can not create object for it
        School sc = new School() {
            // but a anonymous class has been called here that create the object of interface
            @Override
            public void staff() {
                System.out.println("Total 20 teachers are here");
            }
        };
        sc.staff();
    }
}
interface School{
    void staff();
}
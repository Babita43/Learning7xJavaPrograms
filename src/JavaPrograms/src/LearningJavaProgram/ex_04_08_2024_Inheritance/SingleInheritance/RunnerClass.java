package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Inheritance.SingleInheritance;

public class RunnerClass {
    public static void main(String[] args) {
      SonClass s= new SonClass();
      s.property();
      s.sonProperty();
        System.out.println();

      FatherClass f = new FatherClass();
      f.property();
    }
}

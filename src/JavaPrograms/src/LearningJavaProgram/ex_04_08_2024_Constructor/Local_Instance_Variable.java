package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Constructor;

public class Local_Instance_Variable {
    int age = 45;   // it is instance variable that will be used in program in any block
    void human(){
        System.out.println(age);
    }
    void eat(){
        String eyes = "two";  // it is Local variable that be accesible in this block of code only
    }
    void walk(){
      //   System.out.println(eyes);  here eyes does not print because it was llocal variable work onsde the code only
    }
}

package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

public class Strings_Args {
    public static void main(String[] abc) {


        //Note JVM recognise  public static void main(String[] this part for execution, if we add anything inplace of args it does work
if(abc.length>0){   // to check if there is length given then print it
    System.out.println(abc[2]);  // to add args click three dotes near debug in run/debug add values

}else{
    System.out.println("No args added");
}
    }
}

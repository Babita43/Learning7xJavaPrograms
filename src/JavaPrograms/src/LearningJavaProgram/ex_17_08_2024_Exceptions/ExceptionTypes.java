package JavaPrograms.src.LearningJavaProgram.ex_17_08_2024_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTypes {
    public static void main(String[] args) {
        //Execution is an event that occurs during program execution and distupts the flow of instructions
        //there are two types of exceptions
        //Checked (JVM knows about it) that are compile time exceptions, and we can handle them with try catch
        // unchecked  (JVM do not know about it) that are runtime exceptions and we can


        System.out.println("Checked exception");

        try {
            FileInputStream file = new FileInputStream("c:/documenst/page.jps");
        } catch (FileNotFoundException e) {
            System.out.println("File is missing");
        }
        // here we find out during complie time,JVM knows it and we can handle it

        System.out.println("Unchecked exception, jvm knows it after execution after run time");

        try {
            int a = 9;
            int b = a/0;  // this exception jvm knows after execution
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("div by 0 so getting error");
        }
    }


}

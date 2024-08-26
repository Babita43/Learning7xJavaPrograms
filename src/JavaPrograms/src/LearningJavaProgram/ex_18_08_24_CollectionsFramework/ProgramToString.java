package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_CollectionsFramework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ProgramToString {
    public static void main(String[] args) {
        Employee emp = new Employee("Jin","seoul");
        Employee emp1 = new Employee("Suga","Deugu");
        ArrayList arr = new ArrayList();
        arr.add(emp);
        arr.add(emp1);
//without the to string function of object class, it prints the folder name and hexa code
        System.out.println("The output is in hexa format without to string function" + arr);
    }

}
class Employee // extends Object  by daefult every class extends the object class so we cal override the objects method to string to print it
{
    private String name;
    private String address;
    Employee(String name, String address){
this.name = name;
this.address = address;
    }


   @Override
   public String toString(){
        return "Employee{" + "address =" +address+ '\'' + "name="+  name +'}';
    }
}
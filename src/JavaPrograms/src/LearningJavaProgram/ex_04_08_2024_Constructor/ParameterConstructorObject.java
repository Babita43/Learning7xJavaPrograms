package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Constructor;

public class ParameterConstructorObject {
    public static void main(String[] args) {

        ParameterConstructorClass p1 = new ParameterConstructorClass();

        System.out.println("Print the name of p1 : " + p1.name);
        System.out.println("Print the no of p1 : " + p1.phone);

        ParameterConstructorClass p2 = new ParameterConstructorClass("Anki");
        System.out.println("Print the name of p2 : " + p2.name);
        System.out.println("Print the name of p2 : " + p2.phone);

        ParameterConstructorClass p3 = new ParameterConstructorClass("Mehak", 1245787444);
        System.out.println("Print the name of p2 : " + p3.name);
        System.out.println("Print the name of p2 : "+p3.phone);
    }}

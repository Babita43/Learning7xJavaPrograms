package JavaPrograms.src.LearningJavaProgram.Threading_Gernerics;

public class GenericProgram1 {
    public static void main(String[] args) {
        temp(25);   // now we can call it for any data type
        temp(25.12);
        temp("Hello");
    }
public static <T> void temp(T a){
    //instead of data variable int , string we use generic word T then before return type
    //we will use <T> to indicate we are , <T> means it will be using T generic irrespective of data types
    System.out.println(a);

}

}

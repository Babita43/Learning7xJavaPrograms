package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Functions;

public class FuntionwithoutParameters {

    public static void main(String[] args) {
        System.out.println("Here we will call the functions");

        greet();

        int c= greet1();
        System.out.println(c);

        greet("Hi world" );
       int k= greet2(3,4);
        System.out.println(k);
    }

    //without parameter without return type
    public static void greet() {
        System.out.println("Good morning");
    }

    //without parameter with return type
    public static int greet1() {
        int a= 2;
        int b= 3;
        int c=a+b;
        return c;
    }

    //with parameter without return type
    public static void greet(String s) {
        System.out.println("HI");
    }
    //with parameter with return type
    public static int greet2(int i, int j) {
        int k=i+j;
        return k;
    }
}

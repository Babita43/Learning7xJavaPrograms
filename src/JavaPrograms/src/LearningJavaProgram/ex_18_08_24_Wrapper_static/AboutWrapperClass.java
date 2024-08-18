package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_Wrapper_static;

public class AboutWrapperClass {
    public static void main(String[] args) {

//    Wrapper class means to convert primitive to object and vice versa.
//    We use it for advance automation, advance
//    java concept like data structure
//    use to conversion between primitive and string
//    use to use advance utilites
//    String null value-object can have null value
        // Primitive to Wrapper class conversion
        int a = 20;
        Integer a1 = a; // int (primitive) to Integer (objecct) is called "Auto Boxing"
        System.out.println("it is primitive data int :" + a);
        System.out.println("int is converted to wrapper class data Integer" + a1); // extra utilities added
        System.out.println(a1.toString());
        //Wrapper class to primitive conversion
        Integer b = 67;
        int b1 = b;    // Integer (Object) to int (primitive conversion we call it "UnBoxing"
        System.out.println("it is primitive data int :" + b);
        System.out.println("Integer is converted to primitive data int " + b1);


    }
}

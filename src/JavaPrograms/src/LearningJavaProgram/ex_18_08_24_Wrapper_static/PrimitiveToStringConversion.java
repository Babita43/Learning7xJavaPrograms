package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_Wrapper_static;

public class PrimitiveToStringConversion {
    public static void main(String[] args) {
        String name = "111";
        // to convert into  object
        Integer str = Integer.valueOf(name);
        System.out.println("Integer conversion : " + str);
        System.out.println(name);
        // String into primitive
        int name1 = Integer.parseInt(name);    // here first we used object (wrapper class Integer with parse int)
                                               // then it converted to primitive data type
        System.out.println("Primitive conversion : " + name1);


        Double d = 3.14;
        double da = d;
        System.out.println(da);
    }
}

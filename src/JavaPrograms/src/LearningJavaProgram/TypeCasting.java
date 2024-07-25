package JavaPrograms.src.LearningJavaProgram;

public class TypeCasting
{
    public static void main(String[] args) {
        byte e= 5;
        byte f= 6;
        int sum = e+f;  // it will not accept byte it will result integer

        // Type casting is source to destination conversion
        //Two types of Type casting

        byte b= 4; // b is byte
       // int a= b; //valid implicit casting
        // here we have added byte small value in big basket of int--
        //1. it is implicit casting done by jvm
       //  but when we forcefully cast that is explicit casting  like below shown
        int a = (int)b;
        // Widening is from small basket to big basket
        System.out.println(b);

        int i = 200;   // here int is big basket value than byte
       // byte j= i;//Invalid implicit casting
        byte j = (byte)i; // we have forcefully converted big value int into small value byte
          // it is narrowing the basket
        //int is 32 bit but we changed it to 8 bit and it will show the result that fit into byte value
        System.out.println(j);

    }
}

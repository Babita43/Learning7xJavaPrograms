package JavaPrograms.src.LearningJavaProgram.ProgramsToPractice;

public class StringPool
{
    public static void main(String[] args) {
        String a= "Kunal";  // it is storing value in constant pool and same value pointing to one value
        String b= "Kunal";
        System.out.println(a==b);
        String c= new String("aman");
        String d= new String("aman"); // creating new object and objects creates in heap,
        // everytime we create new object with same value , it creates the new object, it does not point to same value as in SCP
        System.out.println(c==d);
        a = "Kushwaha";
        System.out.println(a);

    }
}

package JavaPrograms.src.LearningJavaProgram;

public class Strings {
    public static void main(String[] args) {
        //two ways to write string and both managed by Jvm differently
        String name = "Jasmine";   // this strings with assignment operator saved data in SCP string constant pool
        String nm = name.toUpperCase();
        char n = name.charAt(3);
        int nam = name.length();
        System.out.println(nm);
        System.out.println(n);
        System.out.println(nam);

        String a= "sam";     // these value are changing but the values remains in SCP and does not delete, benefit of it is we can refuse value
        a= "ram";
        a= "pam";
        System.out.println(a);

        String name1 = new String("Rupenzil");  // new it stores value in heap
        String name2 = new String("Rupenzil");
        String na1 =name1;    // it stores in scp
        System.out.println(na1);
//*******************************************************
        String h= "Hello";
        String w= " World";
        String hw = "Hello World";
        String l = "Hello";
        String hw1 = h.concat(w);      //  4 strings are created in SCP
        System.out.println(hw1);
        System.out.println(hw==hw1);  // here it check the refrence
        System.out.println(h==l);         //whne with same content but differnet variables then it points to1 value does not create duplicate value
        System.out.println(h.equals(w));  // it checks with content wise

        //******************************************
        String nameS = new String("Hello");
        String nameO = new String("Hello");
        System.out.println(h==nameS);  // it is false becasue store value is differet one is stored in SCP and other in heap
        System.out.println(h.equals(nameS)); // it is true becasue it checks content wise and content is same
        System.out.println(nameS==nameO);  // check for ref, it is false because stored in heaps but in differnt locations
        System.out.println(nameS.equals(nameO));

        // **NEw keyword always create new memory  and in SCP it points duplicate to same memory**
          }
}

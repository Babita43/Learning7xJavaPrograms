package JavaPrograms.src.LearningJavaProgram.Encapsulation_AccessModifier.Police;


public class JrCop {
    public static void main(String[] args) {
        String name = "John";
        Cop c = new Cop("Spy");
        //as it is public so, it can access byt this class
        System.out.println(c.unifform);

        //as name and bullet set as private it will not show to the class even in same folder
        //System.out.println(c.name);
        //      System.out.println(c.bullets);

        // as it is protected only the class within same folder can access it
        c.canArrest();
    }
}
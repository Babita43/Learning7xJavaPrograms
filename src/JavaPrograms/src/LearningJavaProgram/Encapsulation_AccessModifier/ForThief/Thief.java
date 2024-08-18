package JavaPrograms.src.LearningJavaProgram.Encapsulation_AccessModifier.ForThief;

import JavaPrograms.src.LearningJavaProgram.Encapsulation_AccessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c= new Cop("cahndu");
        // it is public so access by anotehr folder class
        System.out.println(c.unifform);
     // it is private so thief ca not access it
      // System.out.println( c.bullets);
       //System.out.println( c.name);

       // it is protected only access by same folder , so not accesible here
        //c.canArrest();
    }
}

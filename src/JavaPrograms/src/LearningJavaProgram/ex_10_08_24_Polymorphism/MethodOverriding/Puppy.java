package JavaPrograms.src.LearningJavaProgram.ex_10_08_24_Polymorphism.MethodOverriding;

public class Puppy extends Dog{
    @Override
    void bark() {
        System.out.println("I am cute puppy of spitz Breed ");

    }
    void eat()
    {
        System.out.println("Puppy eats and love food");
    }
}

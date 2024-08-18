package JavaPrograms.src.LearningJavaProgram.ex_10_08_24_Polymorphism.MethodOverriding;

public class RunnerMethodOverloading {
    public static void main(String[] args) {

        //Method overriding / Runtime poly/ dynamic poly
// it is used in Inheritance , when child class inherits from parent
        // if child and parent class have same method, then we use override in child class
        // priority will be given to child class
        Puppy pu = new Puppy();
        pu.bark();  // as bark overrides the paresnt class but priority willl be given to child class
        Dog du = new Dog();
        du.bark();  // here parent method will be  called
        Dog dg = new Puppy();
        dg.bark(); // here object was created for puppy with dog class so priority given to puppy method
        Dog dog = new Puppy();
      // ** dog.eat();  paremt can call the object of child it is same only **
    }
}

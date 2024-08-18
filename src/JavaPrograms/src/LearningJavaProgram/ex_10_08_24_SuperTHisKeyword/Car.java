package JavaPrograms.src.LearningJavaProgram.ex_10_08_24_SuperTHisKeyword;

public class Car extends Vehicle {

    Car() {
        // it is called Constructor chaining, when child cons call parent const
        this("Hello world");
        // super();   // it will call super class constructor in child class constructor
        //NOTE : Only one explicit constructor call allowed in constructor
        // super(4); // for para,enter constructor use value like this
        System.out.println("Child constructor");

    }

    Car(String a) {
        System.out.println(a);
    }

    int speed = 100;

    // Super is used for inheritance class , it is used to access data of superclass(parent class) in subclass(childclass)

    void testCar() {
        System.out.println("Speed  taken from own class with this keyword : " + this.speed);
        System.out.println("Speed taken from parent class with super keyword " + super.speed);
        this.message();
        super.message();
    }

    void message() {
        System.out.println("I am from child class");
    }
}

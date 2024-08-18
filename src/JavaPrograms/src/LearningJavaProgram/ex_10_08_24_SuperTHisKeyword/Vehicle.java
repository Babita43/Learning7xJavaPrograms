package JavaPrograms.src.LearningJavaProgram.ex_10_08_24_SuperTHisKeyword;

public class Vehicle {
    int speed = 281;
    // constructor can also call in child clas by super keyword
    Vehicle(){
        System.out.println("Constructor from parent class");
    }
    Vehicle(int a){
        System.out.println(a);
    }
    void vehicleSpeed()
    {
        System.out.println("speed is" +speed);
    }
    void message()
    {
        System.out.println("I am from super class");
    }
}

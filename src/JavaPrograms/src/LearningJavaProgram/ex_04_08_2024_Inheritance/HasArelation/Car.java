package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Inheritance.HasArelation;

public class Car {
void carStart(){
    new Engine().startEngine();
    new Tyre().rolling();
}

    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.carStart();
    }
}

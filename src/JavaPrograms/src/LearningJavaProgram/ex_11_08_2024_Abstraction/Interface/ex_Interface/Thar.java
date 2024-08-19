package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.Interface.ex_Interface;


public class Thar implements Engine {

    void carRun(){
        startCar();
        stopCar();
    }
    @Override
    public void startCar() {
        System.out.println("Car is starting");
    }

    @Override
    public void stopCar() {
        System.out.println("car is stopping");
    }
}

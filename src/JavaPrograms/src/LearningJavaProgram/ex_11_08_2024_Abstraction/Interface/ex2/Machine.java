package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.Interface.ex2;

public class Machine implements Eng {
    void working()
    {
        startCar();
        stopCar();
    }

    @Override
    public void startCar() {
        System.out.println("car start");
    }

    @Override
    public void stopCar() {
        System.out.println("STOB it");
    }
}

package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.Interface.ex_Interface;

public interface Engine {
    // it hides the implemention like abstract but here we use interface keyword instead of class
    // implement keyword is used by subclass to inhert its properteis
    void startCar();
    void  stopCar();
}

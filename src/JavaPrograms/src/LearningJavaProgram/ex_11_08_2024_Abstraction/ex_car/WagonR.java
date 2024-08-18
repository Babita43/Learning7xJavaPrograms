package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.ex_car;


public class WagonR extends Engine {
    void driver() {
        openCar();
        stopCar();
        runCar();
        startCar();
    }
        @Override
        void openCar () {
            System.out.println("Open the wagonR car");
        }

        @Override
        void runCar () {
            System.out.println("Run the wagonR car");
        }

        @Override
        void startCar () {
            System.out.println("Start the wagonR car");
        }

        @Override
        void stopCar () {
            System.out.println("Stop the car");
        }

}

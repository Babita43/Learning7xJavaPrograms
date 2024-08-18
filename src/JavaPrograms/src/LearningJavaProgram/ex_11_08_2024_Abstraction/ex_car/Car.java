package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.ex_car;


class Car extends Engine {
    @Override
       void openCar(){
        System.out.println("User will open car");
     }
     @Override
       void runCar(){
         System.out.println("Tyre will run car");
        }
        @Override
       void startCar(){
            System.out.println("User will start car");
        }
        @Override
        void stopCar(){
            System.out.println("User will stop car");
        }

}

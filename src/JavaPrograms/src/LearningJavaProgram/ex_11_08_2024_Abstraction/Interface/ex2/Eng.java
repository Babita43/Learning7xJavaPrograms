package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.Interface.ex2;

public interface Eng {
    // these are incompleted data
    void startCar();
    void stopCar();
    //body not allowed in interface  except with Static and default keyword
//     void run(){
//         System.out.println();
//     }
    static void setEng(){
        System.out.println("Works with static keyword");
    }
    default void setEngAgain(){
        System.out.println("Works with default keyword");
    }
}

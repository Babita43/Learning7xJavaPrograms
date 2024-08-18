package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.ex_browser;

public class Chrome extends BaseClass{


    @Override
    void openBrowser1(String name) {
        System.out.println("Use Browser to run program  : " + name);
    }

    @Override
    void closeBrowser1(String name) {
        System.out.println("close Browser to stop program  : " + name);
    }
}

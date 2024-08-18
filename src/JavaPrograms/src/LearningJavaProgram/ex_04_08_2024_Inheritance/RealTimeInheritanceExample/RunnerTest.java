package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Inheritance.RealTimeInheritanceExample;

public class RunnerTest {
    public static void main(String[] args) {
        BaseClass tc = new TestClass();   //Dynamic dispatch Father refrence child object
        tc.setBrowser("chrome", true);
        tc.startBrowser();
        tc.closeBrowser();
    }
}
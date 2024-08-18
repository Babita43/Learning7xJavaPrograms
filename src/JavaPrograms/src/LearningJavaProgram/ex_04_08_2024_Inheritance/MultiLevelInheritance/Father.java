package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Inheritance.MultiLevelInheritance;

public class Father extends GrandFather{
    String bunglow = "2BHK";

    void home()
    {
        System.out.println(bunglow);
    }

    void members()
    {
        System.out.println("In hosue of 6 members" + bunglow);
    }
}

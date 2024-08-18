package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Inheritance.MultiLevelInheritance;

public class Son extends Father{

    int flats = 2;

    void house()
    {
        System.out.println(flats);
    }
    void members()
    {
        System.out.println("In hosue of 6 members" + flats);
    }
}

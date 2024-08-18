package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Inheritance.MultiLevelInheritance;

public class Runner {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println("son only");
        // without inheritnecce it shows only the data of his son class
        s.house(); // data from son
        System.out.println("son extends father"); // we call it IS -a relationship , son is a type of father
        //with extends keyword from father, it will show data of his own class and his father's class
        s.house(); // data from son
        s.home(); // data from Father
        System.out.println("Son extends father, father extends GF");
        //with extends keyword in father class it will takes the data of grandfather also
        s.house(); // data from son
        s.home(); // data from Father
        s.stay();
        s.members(); // all the classes have same methods but prefrences will be given to Son > Father >Grand father


        Father f=  new Father();
        f.home();
        f.stay();   // as father extends GF it inherited his data also


    }
}

package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Constructor;

public class ParameterConstructorClass {
    String name;
    int phone;

    ParameterConstructorClass() {
// empty default constructor
    }

    ParameterConstructorClass(String namegiven) {
        //Constructor with parameters
        // this keyword refers to the current instance of the class. When you use this.name = namegiven;//
        // you are assigning the value of namegiven to the instance variable name of the current object.
        this.name = namegiven;
        // ParameterConstructorClass.name =namegiven;     Correct usage if `name` is static
    }

ParameterConstructorClass(String namegiven, int phoneno)
{
    this.name = namegiven;
    this.phone = phoneno;
}
}

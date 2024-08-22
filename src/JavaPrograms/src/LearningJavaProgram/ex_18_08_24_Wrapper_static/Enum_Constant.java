package JavaPrograms.src.LearningJavaProgram.ex_18_08_24_Wrapper_static;


public enum Enum_Constant {

    Base_Url("https://www.flipkart.com/"),
    Login_Url("https://www.flipkart.com/account/login?ret=/");

    //1. create private data
    private String name;

    //2. create constructor
    Enum_Constant(String name){
        this.name = name;

    }
    //create method get value that return type
    public String getValue()
    {
return name;
    }
}

package JavaPrograms.src.LearningJavaProgram.ex_10_08_24_Polymorphism.MethodOverlaoding;

public class MathMethodOverloading {
    //Method overlodaing is when we use one method  multiple times but with different arguments
    // it is type of polymorphism - means many form
    //Method overlaoding is called static poly mor and compile time poly

int add(int a, int b)
{
return (a+b);
}


double add (double a, double b)
{
    return(a + b);
}

String add(String a , String b){
    return (a + b);
}
}

package JavaPrograms.src.LearningJavaProgram.ex_25_07_2024;

public class TernaryOperator
{
    public static void main(String[] args) {
        //ternary operator is like if else condition
        int a= 5;
        int b= 23;
        boolean result = a>b?true:false;
        boolean result1 = a<b?true:false;
        System.out.println(result);
        System.out.println(result1);
        //find the maximum and minimum
        int max = b>a ? b : a;
        int min = a<b ? a :b;
        System.out.println(max);
        System.out.println(min);
    }
}

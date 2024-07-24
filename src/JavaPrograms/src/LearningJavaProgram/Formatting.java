package JavaPrograms.src.LearningJavaProgram;

public class Formatting {
    public static void main(String[] args) {
        int a = 10;
        char ch = 'r';
        String s1= "Sam";
        int b= 20;
        int sum = a+b;
        int sub = a-b;
        int mult = a*b;
        int divide = a+b;
        //%d int byte, int short or long
        //%f for float
        //%ch for char
        //%s for string
        System.out.printf("sum of no is %d\n",a);

        System.out.printf("The char is %ch\n",ch);


        System.out.printf("the diff is %d\n",sub);

        System.out.printf("the multiplication is %d\n",mult);

        System.out.printf("sum of num is %d\n",sum);
    }
}

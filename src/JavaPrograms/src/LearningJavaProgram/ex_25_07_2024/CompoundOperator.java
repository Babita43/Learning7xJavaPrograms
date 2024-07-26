package JavaPrograms.src.LearningJavaProgram.ex_25_07_2024;

public class CompoundOperator
{
    public static void main(String[] args) {

        // 1.  Unary operator it has one operand and one operator z is operand and uranry value is +
        int z= 16;   //int z is data type, z is variable name(Identifier), 10 is variable value(literal)

//2. Binary operator - it has 2 operands like b and s, and operator +
        int b= +20; //unary plus
        int s = -10   ; //unary minus
        int sum1 = b+s;
        System.out.println(sum1);
        System.out.println("============");
//3.trinary - where 3 operands are used
   int a = 22;
//compound operator are +=,-=,/=,*=
        a+=10;  //it means we will add 10 in value of a
        a-=2; //it means we will - 2 in value of a
        a*=3;// it means we multiply 3 invalue of a
        a/=2; // it means value of a is divisible by 2
        a%=4; // it means value of a divided by 4 and prvode modules/remainder

        /*So, here what happened value of a was 22
                then 22+ 10=32, now value of a is 32
                then 32-2= 30, now value of a= 30
                then 30*3 , now value of a=90
                then 91/2, now value of a is 45
                then 45%4 , now value of a is 1
                till using the above lines, value of a getitng changed and in last value of a is 1
            and in print satement it takes the last value of a i.e 1
           */
// System.out.println(a);   if we stopped here ans would be 1
        System.out.println(a+=10); //here 1+10 =11
        System.out.println(a-=2);// 11-2= 9
        System.out.println(a*=3);//9*3=27
        System.out.println(a/=2);//27/2=13
        System.out.println(a%=4);//13%4= 1




    }
}

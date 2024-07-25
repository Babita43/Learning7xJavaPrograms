package JavaPrograms.src.LearningJavaProgram;

public class IncrementDecrement {
    public static void main(String[] args) {
        // PreIncrement  - in this first value is incremented then store in location
        int c = 33;
        System.out.println(++c);// here is increment the value first means expression = 34
        System.out.println(c); //then value store in c as incremented = 34

        //Post increment -value stored in first as it is and then incremented
        int x = 8;
        System.out.println(x++); // it is post incemented , it stores the value as it is first expression =8
        System.out.println(x); //the the value stored by incrementing = 9

        int s = 32;
        System.out.println(s++ + ++s); //(32+34 =65)
        //A- s++, here expression is 32   and value of s become 33 after increment
        //operator +
        // now value of s is 33 due to s++
        //B- ++s, here expression is 34 and value of s is 34 as it is incremented pre

        //here s= 34 by above
        System.out.println(s++ + s);//(34+35)
        //A- s++ expresssion= 34 ,  value becomes 35 after incremented
        //opertor +
        //here value is 35
        //B -s= 35

        int d = 54;
        int y = 56;
        //A- x++, expression = 54 value = 55
        //operator +
        //B- ++y expression = 57 value 57
        int z = d++ + ++y;  //(54+57=111)
        System.out.println("sum of Z is :" + z);

        int e = z + y++; //(111+57 =168)
        // A -z= 111
        //B - y++ = expression 57 value 57

        System.out.println("sum of E is =" + e);

        int f = 10;
        System.out.println("The value of f is : " + (++f + f++ + f++)); //11 + 11 +12 =34
        //f++ is greyed becsuse The result of the post-increment operation (f++) is used for calculation purposes, but the incremented value (13) is not used within the same statement. The editor might consider the side effect (incrementing f to 13) not directly affecting the outcome of the current line's expression.
       // System.out.println(f);

    }
}
package JavaPrograms.src.LearningJavaProgram;

public class RelationalOperators {
    public static void main(String[] args) {
        //Value of relational operators is in boolean true or false
        //<, >, !=,>=, <=,==
int bagPrice = 100;
int shoePrice = 300;
int dressPrice = 100;
boolean result = bagPrice >shoePrice;
boolean result1 = bagPrice <shoePrice;
boolean result2 = bagPrice ==dressPrice;
boolean result3 = bagPrice >=shoePrice; // here it will check bp > sp OR bp=sp
boolean result4 = bagPrice !=dressPrice;
boolean result5 = !(bagPrice >dressPrice);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


    }
}

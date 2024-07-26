package JavaPrograms.src.LearningJavaProgram.ex_25_07_2024;

public class EscapeCharacters
{
    public static void main(String[] args) {
        char a ='\n';  //it prints in next line
        char b= '\b';  // it deletes one char
        char c= '\r'; // it deletes one word
        char d = '\t'; //it is tab adds space
        String s= "Pramod";
        String s1 ="aman";
        int a1= 10;
        int  b1 = 5;
        System.out.println(s+'\n'+s1);
        System.out.println(s+'\r'+s1); //we can directly use it
        System.out.println(s+'\t'+s1);
        System.out.println(s+'\b'+s1);
        System.out.println(a1+c+b1);
        System.out.println(a1+d+b1);
    }
}

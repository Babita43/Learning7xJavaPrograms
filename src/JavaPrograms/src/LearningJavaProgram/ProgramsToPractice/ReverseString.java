package JavaPrograms.src.LearningJavaProgram.ProgramsToPractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the String : ");
        String s= sc.next().toLowerCase();
        //  String s= "Babita";
char ch[] = s.toCharArray();
        for (int i= 0; i<s.length()/2;i++){
            char temp = ch[i];
            ch[i]=ch[s.length()-1-i];
            ch[s.length()-1-i] =temp;
        }
        String rev = new String(ch);
        System.out.println(rev);
    }
}

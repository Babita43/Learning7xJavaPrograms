package JavaPrograms.src.LearningJavaProgram;

public class Concatination {
    public static void main(String[] args) {
        int a= 67;
        int b = 34;
        String s1 = "Hope";
        String s2 = "world";
        char ch = 'j';
        float fl = 67.87f;
        boolean bo= true;
      //  concat works from left to right if int comes before it will add them as per bodmas
        //charcater will add as interg if comes first
        //+ canot be applied to boolean
        System.out.println(a+ch+b);
        System.out.println(a+ch+s1);
        System.out.println(a+s2+ch+s1);
        System.out.println(a*ch+s1);
        System.out.println(fl*ch+s1);
        System.out.println(fl+a+s1);
        System.out.println(s1+a+ch);
        System.out.println(s1+ch+s2);
        System.out.println(ch);
        System.out.println(ch+b);

        int d= 43;
        int f= 24;
        String si = "KK";
        String sj = "vv";
        System.out.println(si+sj+d+f);
        System.out.println((si+sj)+ d+ f);
        System.out.println((si+sj)+ (d+ f));
        System.out.println((si+sj+ d)+ f);

    }
}

package JavaPrograms.src.LearningJavaProgram.Threading_Gernerics;

public class GenericProgram2 {
    public static void main(String[] args) {

        // for Max value
int i = maxWithString(45, 56,98);
double d =maxWithString(95.6,74.6, 89.00);
String s =maxWithString("anam","anam","mehak");
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
        
        System.out.println("+++++++++++++++++++=");

        //for min value

        int i1 = minWithString(45, 56,98);
        double d1 =minWithString(95.6,74.6, 89.00);
        String s1 =minWithString("anam","anam","mehak");
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(s1);
    }
    public static <T extends Comparable <T>> T maxWithString(T a, T b, T c){
        T max = a;
              if(b.compareTo(max)>0){
                  max =b;
              }
              if(c.compareTo(max)>0){
                  max=c;
              }
              return max;
    }
    public static <T extends Comparable <T>> T minWithString(T a1, T b1, T c1){

        T min=a1;
        if(b1.compareTo(min)>0){
           b1=min;
        }
        if(c1.compareTo(min)>0){
            c1=min;
        }
        return min;
    }
}

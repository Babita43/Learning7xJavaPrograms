package JavaPrograms.src.LearningJavaProgram.Threading_Gernerics;

public class GenericsProgram {
    //Generics allows the reusability of the code, where one method can be used with different datatypes
    public static void main(String[] args) {

        //Here in this program we can only compare integer values what if we want to compare double, float, string, we need to write respective method for each data type
        // so generic code is the solution

   int maxvalue =maximumValueOf(93, 34, 89);
        System.out.println(maxvalue);
    }

    public static int maximumValueOf(int a, int b, int c) {
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            return max;

        }
    }

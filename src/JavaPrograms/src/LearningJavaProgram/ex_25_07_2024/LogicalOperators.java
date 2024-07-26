package JavaPrograms.src.LearningJavaProgram.ex_25_07_2024;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // In this case, b is not evaluated because a is true
        boolean result1 = a || (b = true);
System.out.println(result1);

    a = false;
    b = false;

    // In this case, b is evaluated because a is false
    boolean result2 = a && (b = true);
System.out.println(result2);

        int c= 12;
        boolean boo = !(c>10||c<8);
        boolean boo1 = !(c>10&&c<8);
        System.out.println(boo);
        System.out.println(boo1);

/*Note :
When to use &&
                When you want to check if multiple conditions are all true.
                When all conditions must be met for the action to be performed.
 When to use ||
When you want to check if at least one of several conditions is true.
When any one of the conditions being true is sufficient for the action to be performed.
*/
    }

}

package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Arrays;

public class AboutArray {
    public static void main(String[] args) {
      /* Array is collection of same data type
       It Stores data in continuous memory
       Its index start from [0] and lenght 1
       it is fixed size */


        //datatype arrayName[] // declaring and initialing of array
        //datatype : Primitive : boolean, byte, short, int, float, double, char  Non-primitive :String class enum

        int number[] ={1,3, 4, 5, 6}; //it allows similar types of data only
        char ch[] ={'a','A','@'}; // special character is also character
// the above is hardcoded way
        //Disadvantage is
        //wastage of memory
        //Elements are fixed
        // length is fixed
        //we can check who is present at which index

        System.out.println(ch[0]);
        //System.out.println(ch[-1]);  it will cause array index out of bound issue
//*********************
        String chocolates[] = new String[4];
        chocolates[2] = "Dairy Milk";
        System.out.println(chocolates[0]); // as it is string it returns null value
    }
}

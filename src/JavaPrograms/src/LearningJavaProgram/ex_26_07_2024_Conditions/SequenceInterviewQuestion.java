package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

public class SequenceInterviewQuestion 
{
    public static void main(String[] args) {
//        if(true){
//            System.out.println(1);
//        }     else   if (true){        // else if condition - it will check if one condition is true then rest does not work
//            System.out.println(2);
//        }     else   if(true){
//            System.out.println(3);
//        }
//
//        //****************
//        if(true){
//            System.out.println(1); // with out else it will print all until value false
//        }   if (true){
//            System.out.println(2);
//        }   if(true){
//            System.out.println(3);
//        }
        //**********
        if(true) {
            System.out.println("1");
            if (true) {
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }
    }
}

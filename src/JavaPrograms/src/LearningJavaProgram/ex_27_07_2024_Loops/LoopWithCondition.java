package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Loops;

public class LoopWithCondition {
    public static void main(String[] args) {
        for(int i=0; i<=6;  i++){
            if(i==5){
                System.out.println("Fire");
            }else
            System.out.println(i);
        }
//*************************
        //Break - it stops the execution from the line
        for(int j=0; j<=10;  j++){
            if(j==3){
                System.out.println("Fire");
                break;  //after this, it will not execute next line of code
            }else
                System.out.println(j);
        }

   //*****************
        for(int j=0; j<=10;  j++){
            if(j==3){
                System.out.println(j);    // then it will print 3 also
                System.out.println("Fire");
                break;  //after this, it will not execute next line of code
            }
        }


//Continue - it skips the condition and execute next line

        for(int k=0; k<=10;  k++){
            if(k==3){
                System.out.println("Three");
                continue;  //after this, it will not execute next line of code
            }
                System.out.println(k);
        }
    }
}

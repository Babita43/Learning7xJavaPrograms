package JavaPrograms.src.LearningJavaProgram.ex_27_07_2024_Loops;

public class WholeLoop {
    public static void main(String[] args) {
        int pen =0;
        while(pen<5){
            System.out.println(pen);
            pen++;
        }
        System.out.println("***************");
        int pencil =0;
        while(pencil <5){
            if(pencil%2==0){
                System.out.println( "It is even" +pencil);

            }

            pencil++;
        }

        System.out.println("***************");
        int penci =0;
        while(penci <5){
            if(penci %2!=0){
               System.out.println( "It is odd" + penci);

            }

            penci++;
        }
    }
}

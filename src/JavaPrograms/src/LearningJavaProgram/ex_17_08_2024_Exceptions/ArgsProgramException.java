package JavaPrograms.src.LearningJavaProgram.ex_17_08_2024_Exceptions;

public class ArgsProgramException {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            for(int i=0; i<3;i++){
               String j = args[i];
                System.out.println(j);
            }
            int a = Integer.parseInt(args[1]);
            int b = 8/a;
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e.getMessage());
        }
        //instead of 3 different lines for try catch, we used or conditon and added exceptions
    finally{
            //finally use to close SCanner, file, sql
            System.out.println("I will be executed Anyhow!!");
        }
    }

}

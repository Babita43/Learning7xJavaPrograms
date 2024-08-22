package JavaPrograms.src.LearningJavaProgram.ex_17_08_2024_Exceptions;

public class ExceptionPassingConcept {
    public static void main(String[] args) {
       extrcated();
    }
   public static void extrcated(){
extracted1();
   }
   public static void  extracted1(){
        //this exception will be passed to main
       try {
           Integer i[] = new Integer[2];
           System.out.println(i[3]);
       } catch (Exception e) {
           System.out.println("Exception due to array size is large");
       } finally {
           System.out.println("close program");
       }
   }
}

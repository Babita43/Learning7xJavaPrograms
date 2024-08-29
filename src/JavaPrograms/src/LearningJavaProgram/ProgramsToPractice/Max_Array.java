package JavaPrograms.src.LearningJavaProgram.ProgramsToPractice;

public class Max_Array {
    public static void main(String[] args) {
        int arr[]= {45,89,23,4,25};
        int max= arr[0];
        for(int i=0; i< arr.length; i ++){
         if(arr[i]>max) {
             max = arr[i];
         }
        }
        System.out.println(max);
    }
}

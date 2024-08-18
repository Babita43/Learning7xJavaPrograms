package JavaPrograms.src.LearningJavaProgram.ex_10_08_24_Polymorphism.MethodOverlaoding;

public class RunnerOverloading {
    public static void main(String[] args) {
        MathMethodOverloading mo = new MathMethodOverloading();
       int result = mo.add(8,9);
        double result1= mo.add(56.5,89.1);
        String result2 = mo.add("Priceless", "1232");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}

package JavaPrograms.src.LearningJavaProgram.ex_25_07_2024;

public class StringPart2 {
    public static void main(String[] args) {
        String password = "Jin@123!";
        String pwd = password.toUpperCase();
        System.out.println(password == pwd);  // it isfalse bcoz one is converted to uprcase
        System.out.println(password.contains(pwd));
        System.out.println(password.equals(pwd));
        System.out.println(password.equalsIgnoreCase(pwd)); // it is true bcoz it ignores small or caps
        System.out.println(password.substring(2,5));
        System.out.println(password.indexOf('@'));

    }

    }
package JavaPrograms.src.LearningJavaProgram.ProgramsToPractice;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "abccba";
        //a no from front and end same is called palindrome
        boolean isPalindrome = true;

        for (int i = 0; i < s.length()/2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);
            if (start != end) {
                isPalindrome= false;
                break;
            }
            }
        if (isPalindrome) {
            System.out.println("The String is palindrome");
        }else{
            System.out.println("The String is not palindrome");

        }
        }
    }


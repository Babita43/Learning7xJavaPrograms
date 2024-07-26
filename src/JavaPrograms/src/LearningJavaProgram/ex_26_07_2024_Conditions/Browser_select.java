package JavaPrograms.src.LearningJavaProgram.ex_26_07_2024_Conditions;

import java.util.Scanner;

public class Browser_select {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the browser name that you will use for testing : ");
        String browser = sc.next();
        switch (browser)
        {
            case "ChromeBrowser" :
                System.out.println("Use Chorme Browser");
               break;
                case "FirefoxBrowser" :
                System.out.println("Use Firefox Browser");
                break;
                case "EdgeBrowser" :
                System.out.println("Use Edge Browser");
                break;
                case "UbuntuBrowser" :
                System.out.println("Use Ubuntu Browser");
                break;
         default:

                System.out.println("No any browser");
        }
        System.out.println("Here loop ends");
    }
}

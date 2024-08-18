package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Inheritance.RealTimeInheritanceExample;

public class BaseClass {

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
       if(isAuth){
           this.browser = browser;
       }else{
           System.out.println("You are not allowed");
       }
    }

   void startBrowser(){
       System.out.println("Open the browser");
   }
    void startBrowser(String browsername){
        System.out.println("Open the browser!!" + browsername);
    }
    void closeBrowser(){
        System.out.println("Close the browser!!");
    }

}

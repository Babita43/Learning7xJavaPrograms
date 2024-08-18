package JavaPrograms.src.LearningJavaProgram.Encapsulation_AccessModifier;

public class EncapsUsernameandPwd
// Note : We can have multiple classes in a class but can make only one class Public
    // we can call the data members from another class but data is not secured here

{
    public static void main(String[] args) {
        UserData ud = new UserData("admin", "123");
        System.out.println(ud.username);
        ud.username = "admini";           // here data is not secured we can see password and username
        System.out.println(ud.password);
        ud.password = "1234";
    }

}

class UserData {

    public String username;
    public String password;

    public UserData(String user, String pwd) {
        this.username = user;
        this.password = pwd;
    }
}
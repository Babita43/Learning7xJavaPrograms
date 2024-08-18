package JavaPrograms.src.LearningJavaProgram.Encapsulation_AccessModifier;

public class EncapsUsernameandPwdFixed {
    public static void main(String[] args) {
        UserData1 ud = new UserData1("admin", "123");
        // in this we will allow username to get the username but not allow to set it
        System.out.println(ud.getUsername1());
        // user will get password but will set password only if it is authenticated
        System.out.println(ud.getPassword1());
//Write code to authenticate the user
        // if create by babita it is ture and by amit false
      ud.setPassword1("12364", false); // if authentication is false it will not allow to set password
        System.out.println(ud.getPassword1());
        ud.setPassword1("1234",true);
        System.out.println(ud.getPassword1()); // here user can change it ( we have used if condition with boolean)

    }
}

   class UserData1 {
     private  String username1;
       private String password1;

       // As per Encapsulation we can not access data member without funtion that is Getter and setter . it to use these private data in another class

       public String getUsername1() {
           return username1;
       }

//       public void setUsername1(String username1) {
//           this.username1 = username1;
//       }
       public String getPassword1() {
           return password1;
       }

       public void setPassword1(String password1,boolean isAuthenticate) {
           if(isAuthenticate)
           {
               this.password1 = password1;
           }else{
               System.out.println("You are not allowed");
           }
       }





       //Constructor

       public UserData1(String username1, String password1)
       {
           this.username1 = username1;
           this.password1 = password1;
       }
   }


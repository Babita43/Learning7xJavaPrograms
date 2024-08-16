package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Constructor;

public class BankAccountObjectUsingMethodCallingForLoop {
    public static void main(String[] args) {
        BankAccountClass ba[] =
                {
                        // length of array object is 5(ba.length)
                        new BankAccountClass(),
                        new BankAccountClass("Ayub Bank"),
                        new BankAccountClass("Yes Bank"),
                        new BankAccountClass("JK bank", 112),
                        new BankAccountClass("City Bank", 102, "City0067")
                };

for(int i=0;i< ba.length;i++)
{

   // System.out.println(ba[i].PrintDetails()); // with sout it return value
    // so in base call need to uncomment return with method
    System.out.println();
}
    }
}

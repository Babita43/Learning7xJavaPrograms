package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Constructor;

public class BankAccountObjectUsingMethodCalling {
    public static void main(String[] args) {
        BankAccountClass ba1 = new BankAccountClass();

        BankAccountClass ba2=    new BankAccountClass("ICICI");

        BankAccountClass ba3=    new BankAccountClass("PNB", 003);

        BankAccountClass ba4=    new BankAccountClass("Sindh Bank", 004);

        BankAccountClass ba5=    new BankAccountClass("Canara Bank", 005, "Cana0021221") ;


        ba1.PrintDetails();
        System.out.println();
        ba2.PrintDetails();
        System.out.println();
        ba3.PrintDetails();
        System.out.println();
        ba4.PrintDetails();
        System.out.println();
        ba5.PrintDetails();
    }
}

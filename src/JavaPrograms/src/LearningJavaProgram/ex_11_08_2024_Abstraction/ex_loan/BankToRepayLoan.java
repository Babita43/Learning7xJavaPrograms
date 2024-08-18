package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.ex_loan;

public class BankToRepayLoan {
    public static void main(String[] args) {
       //  Father  f = new Son(); we can create object of concrete class only
        //abstract class object can not be created
        // but we can make dynamic dispatch by using father class as refrence and son class as object
        Son s = new Son();
        s.payLaon();
    }
}

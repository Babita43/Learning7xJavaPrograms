package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.ex_loan;

public class Son extends Father {

    // extends use to copy the methods
    //with no abstract keyword it is concrete class
    void payLaon()
    {
        loan25k();
        loan50K();
    }

    @Override
   void loan50K() {
        System.out.println("Son will complete loan");
    }

}

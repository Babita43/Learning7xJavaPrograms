package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.Interface.ex_MultipleInheritance;

public class Son implements Fathr,Mothr{

    void payLoan(){
        loan();
        home();
    }
    @Override
    public void loan() {
        System.out.println("Son  will pay");
    }

    @Override
    public void home() {

    }
}

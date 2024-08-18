package JavaPrograms.src.LearningJavaProgram.ex_11_08_2024_Abstraction.ex_loan;

abstract class Father {
    // as abstract is used here and methods are incomplete here so it is non-concrete class
    //abstarct class can not be final, because it if it constant who will complete incomplete methods
    abstract void loan50K();
    void loan25k(){
        System.out.println("Loan finished");
    }
}

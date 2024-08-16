package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Constructor;

public class BankAccountClass {
    String bankName;
    int bankCode;
    String bankAccountNo;
// Deafult constuctor
    BankAccountClass()
    {
        bankName = "SBI";
        bankCode = 002;
        bankAccountNo = "SBI00121";
    }
//Single parameter constructor
    BankAccountClass(String banknameis)
    {
        this.bankName = banknameis;
    }
//double parameter cosntructor
    BankAccountClass(String banknameis,int codeis)
    {
        this.bankName = banknameis;
        this.bankCode = codeis;
    }
//tripple parameter constructor
    BankAccountClass(String banknameis,int codeis,String accountNo)
    {
        this.bankName = banknameis;
        this.bankCode = codeis;
        this.bankAccountNo= accountNo;
    }

   //String
    void PrintDetails(){

        System.out.println("Print Bank  name : " + bankName);
        System.out.println("Print Bank code : " + bankCode);
        System.out.println("Print Bank account name : " + bankAccountNo);
// return "Bank Name: " + this.bankName + ", Bank Code: " + this.bankCode + ", Account No: " + this.bankAccountNo;
  // return "";
    }
}

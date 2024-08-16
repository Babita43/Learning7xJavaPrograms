package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Constructor;

public class BankAccountObject {
    public static void main(String[] args) {
    BankAccountClass ba1 = new BankAccountClass();
        // here it will use default constructor
        // and values null/0 replaced by constructor values
        BankAccountClass ba2 = new BankAccountClass("ICICI");

        BankAccountClass ba3 = new BankAccountClass("PNB", 003);

        BankAccountClass ba4 = new BankAccountClass("Sindh Bank", 004);

        BankAccountClass ba5 = new BankAccountClass("Canara Bank", 005, "Cana0021221");

        System.out.println("Details of ba1 : " + ba1.bankName);
        System.out.println("Details of ba1 : " + ba1.bankCode);
        System.out.println("Details of ba1 : " + ba1.bankAccountNo);
        System.out.println();
        System.out.println("Details of ba2 : " + ba2.bankName);
        System.out.println("Details of ba2 : " + ba2.bankCode);
        System.out.println("Details of ba2 : " + ba2.bankAccountNo);
        System.out.println();

        System.out.println("Details of ba3 : " + ba3.bankName);
        System.out.println("Details of ba3 : " + ba3.bankCode);
        System.out.println("Details of ba3 : " + ba3.bankAccountNo);
        System.out.println();

        System.out.println("Details of ba4 : " + ba4.bankName);
        System.out.println("Details of ba4 : " + ba4.bankCode);
        System.out.println("Details of ba4 : " + ba4.bankAccountNo);
        System.out.println();

        System.out.println("Details of ba5 : " + ba5.bankName);
        System.out.println("Details of ba5 : " + ba5.bankCode);
        System.out.println("Details of ba5 : " + ba5.bankAccountNo);

        System.out.println(" FOR LOOP CAN BE USED FOR ABOVE USING ARRAY OF OBJECT");
        System.out.println();

        BankAccountClass ba[] = {    // here created array of object
                new BankAccountClass(), //ba1
                new BankAccountClass("ICICI"),//ba2
                new BankAccountClass("PNB", 003),//ba3
                new BankAccountClass("Sindh Bank", 004), //ba4
                new BankAccountClass("Canara Bank", 005, "Cana0021221"),//b5
        };
        for (int i = 0; i <ba.length ;i++){
            BankAccountClass account=ba[i];
            System.out.println("Details of ba" + (i+1) + "=" +  account.bankName);
            System.out.println("Details of ba" + (i+1) + "=" +  account.bankCode);
            System.out.println("Details of ba" + (i+1) + "=" +  account.bankAccountNo);
            System.out.println();
        }

    }
}

package JavaPrograms.src.LearningJavaProgram.ex_04_08_2024_Constructor;

public class BankAccountObjectForLoopWithoutMethodCalling {
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

        for (int i = 0; i < ba.length; i++) {
            BankAccountClass account = ba[i];
            System.out.println("Print the name of ba" + (i) + ":" + account.bankName);
            System.out.println("Print the name of ba" + (i) + ":" + account.bankCode);
            System.out.println("Print the name of ba" + (i) + ":" + account.bankAccountNo);
            System.out.println();
        }

        /*
        Explanation:
        Array of Objects: An array named accounts holds instances of BankAccountClass.
        Looping: The for loop iterates through the array, printing the details of each account.
        Dynamic Index: i + 1 dynamically assigns the correct ba number (e.g., ba1, ba2) during each iteration.
        This approach not only makes your code more concise but also easier to maintain,
        especially if you need to add or remove BankAccountClass instances.
         */
    }
}

package lections.lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

}

class bankAccountTest{
    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount();
        BankAccount yourBankAccount = new BankAccount();
        BankAccount hisBankAccount = new BankAccount();

        myBankAccount.id = 1;
        myBankAccount.name = "Yevhenii";
        myBankAccount.balance = 12.35;

        yourBankAccount.id = 2;
        yourBankAccount.name = "Mike";
        yourBankAccount.balance = 20.05;

        hisBankAccount.id = 3;
        hisBankAccount.name = "Nick";
        hisBankAccount.balance = 45.06;

        System.out.println(myBankAccount.name );

    }
}

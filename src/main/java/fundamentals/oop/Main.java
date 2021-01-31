package fundamentals.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();
        System.out.println("Type : " + bankAccount.getType());
        System.out.println("Currency : " + bankAccount.getCurrency());
        Client client1 = new Client("Larisa", "1881250812576" + " , ", bankAccount);
        System.out.println(client1);

        client1.getBankAccount().addMoney(12);
        client1.getBankAccount().withdrawMoney(13);
        System.out.println(client1.toString());
        client1.getBankAccount().setType(" SPENDING ");
        client1.getBankAccount().addMoney(1);

        double x = BankAccount.convertMoneyToCorrency(10,"EUR","USD");
        System.out.println( BankAccount.convertMoneyToCorrency(10,"EUR","USD"));
        System.out.println(x);

        BankAccount bankAccount1 = new BankAccount("SAVING", "USD");
        BankAccount bankAccount2 = new BankAccount("SPENDING", "USD");
        BankAccount[] myArray = { bankAccount1, bankAccount2 };
        client1.setBankAccounts(myArray);
        System.out.println(myArray[0]);
        BankAccount[] clientBaAccounts = client1.getBankAccounts();
        System.out.println(clientBaAccounts[0]);
        System.out.println(client1.getBankAccounts()[0]);
        System.out.println(client1);



        System.out.println(" Input client name: ");                     //Client nr2
        String name = scanner.next();
        System.out.println("Input clientt's cnp ");
        String cnp = scanner.next();
        Client client2 = new Client(name, cnp + " , ");
        System.out.println(client2.toString());


    }
}

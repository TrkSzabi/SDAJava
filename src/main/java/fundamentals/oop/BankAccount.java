package fundamentals.oop;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.IllegalFormatCodePointException;

/**
 * BankAccount which is consists of:
 * constructor: with arguments: type and currency ( for initializing the fields and the  balance will be initialized with 0 in the constructor)
 * fields: type of the account (SAVING or SPENDING),  balance ( the amount of money), currency ( USD, EUR),
 * methods:
 * addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of money that is added needs to be bigger than 10% of balance otherwise print a suggestive  error message)
 * withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance can not be < 0 otherwise print a suggestive  error message ),
 * covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert, and the currency to convert to and returns the result = the money in the input currency)
 */

public class BankAccount {
    /**
     * Type of the account : SAVING or SPENDING
     */
    private String type;
    /**
     * Balance of the account
     */
    private double balance;
    /**
     * Currency : USD or EUR
     */
    private String currency;
    public final static double USD_TO_EUR = 0.85;
    public final static double EUR_TO_USD = 1.23;

    public BankAccount(String type, String currency) {                 // 1st Contructor
        this.type = type;
        this.currency = currency;
        this.balance = 0;
    }

    public BankAccount() {                                             // 2nd Constructor
        this.type = "SAVING";
        this.currency = "USD";
        this.balance = 0;
    }

    public void addMoney(double newMoney) {
        if (this.type == " SPENDING " && newMoney <= this.balance / 10) {
            System.out.println("Please ad at least 10% of actual balance ");
            return;
        }
        this.balance += newMoney;
        System.out.println(" Your new balance is: " + this.balance);
    }

    /*  withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING
    the remaining balance can not be < 0 otherwise print a suggestive  error message ) */

    public void withdrawMoney(double newMoney) {
        if (this.balance - newMoney < 0 && this.type == "SAVING") {
            System.out.println(" Your balance can't be nagative ");
            return;
        }
        this.balance -= newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

   /*covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert,
    and the currency to convert to and returns the result = the money in the input currency) */


    public static double convertMoneyToCorrency(double amountOfMoney, String inputCurrency, String outputCurrency) {
        if (inputCurrency.equals("EUR") && outputCurrency.equals(" USD ")) {
            return amountOfMoney * EUR_TO_USD;
        }
        return amountOfMoney * USD_TO_EUR;

    }


    @Override
    public String toString() {                                           // Alt+Insert = auto generate Constructor
        return "BankAccount{" +
                "type='" + type + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }

    public String getType() {                                            // Alt+Insert = auto generate Getters/Setters
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Return the balance of accounts
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {                // CTRL -Click ne duce direct la metoda
        this.currency = currency;
    }
}

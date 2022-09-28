import java.util.*;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalAmount;

    // Constructor
    public BankAccount(){
        numberOfAccounts++;
    }

    public BankAccount(double checkingBalance, double savingsBalance, int numberOfAccounts, double totalAmount){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        BankAccount.numberOfAccounts++;
        BankAccount.totalAmount = checkingBalance + savingsBalance;
    }

    // Getter and Setter Methods
    public double getChecking(){
        return checkingBalance;
    }

    public void setChecking(double number){
        checkingBalance += number;
    }

    public double getSavings(){
        return savingsBalance;
    }

    public void setSavings(double number){
        savingsBalance += number;
    }
    
    public static double getTotalAmount(){
        return BankAccount.totalAmount;
    }

    // methods
    public void depositMoney(String account, double number){
        if (account == "checking"){
            this.checkingBalance += number;
            BankAccount.totalAmount += this.checkingBalance;
            System.out.println(totalAmount);
        }
        else if(account == "savings"){
            this.savingsBalance += number;
            BankAccount.totalAmount += this.savingsBalance;
            System.out.println(totalAmount);
        }
    }

    public void withdrawMoney(String account, double number){

        if (account == "savings"){
            if(savingsBalance <= 0){
                System.out.println("Insufficient Funds");
            }else{
                BankAccount.totalAmount -= amount;
                this.savingsBalance -= number;
                totalAmount -= number;
                System.out.println(totalAmount);
            }
        }
        else if(account =="checking"){
            if(checkingBalance <=0){
                System.out.println("Insufficient Funds");
            }else{
            BankAccount.totalAmount -= amount;
            this.checkingBalance -= number;
            totalAmount -= number;
            System.out.println(this.checkingBalance);
            }
        }
    }

    










}
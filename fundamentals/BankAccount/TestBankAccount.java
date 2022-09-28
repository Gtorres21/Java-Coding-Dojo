import java.util.*;

public class TestBankAccount {
    public static void main(String[] args){

        BankAccount accountTest = new BankAccount();
        accountTest.depositMoney("checking", 15.00);
        accountTest.withdrawMoney("checking", 2.00);
        System.out.println(BankAccount.getTotalAmount());


    }
}
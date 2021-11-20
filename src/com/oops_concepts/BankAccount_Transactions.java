package com.oops_concepts;

import com.beans.BankAccount;

public class BankAccount_Transactions
{

    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount();
       /* BankAccount_Transactions bankAccount_transactions = new BankAccount_Transactions();
        bankAccount_transactions.entryDetails(bankAccount);*/
        System.out.println(bankAccount.get_accountNumber()+ " "+bankAccount.get_balance()+" "+bankAccount.get_customerName());

        bankAccount.updateDepositFunds(500.0f);
        bankAccount.updateWithdrawnMoney(12000.0f);
        System.out.println(bankAccount.get_accountNumber()+ " "+bankAccount.get_balance()+" "+bankAccount.get_customerName());




    }
   /* public  void entryDetails(BankAccount bankAccount)
    {

        bankAccount.set_customerName("Deep Singh");
        bankAccount.set_accountNumber(989898989);
        bankAccount.set_balance(100000.0f);
        bankAccount.set_emailAddress("deep9579@gmil.com");
        bankAccount.set_phoneNumber("7771984494");
    }*/


}

package com.beans;

public class BankAccount
{
    int _accountNumber;
    float _balance;
    String _customerName;
    String _emailAddress;
    String _phoneNumber;

    public BankAccount()
    {
        //calling parameter constructor from default constructor with certain values of our choice:
        //but this has to be the first line always always
        this(123456,1000.0f,"Dummy Person","dummy@gmail.com","9876789876");

    }

    public BankAccount(int _accountNumber, float _balance, String _customerName, String _emailAddress, String _phoneNumber)
    {
        System.out.println("parameterized constructor called");
        this._accountNumber = _accountNumber;
        this._balance = _balance;
        this._customerName = _customerName;
        this._emailAddress = _emailAddress;
        this._phoneNumber = _phoneNumber;
    }

    public BankAccount(String _customerName, String _emailAddress, String _phoneNumber)
    {
        //this constructor doesn't have account Number and balance for user
        //but here we can provide dummy values and update rest of the upcoming values
      /*  this._customerName = _customerName;
        this._emailAddress = _emailAddress;
        this._phoneNumber = _phoneNumber;*/
        this(888555,900.0f,_customerName,_emailAddress,_phoneNumber);
    }

    public int get_accountNumber() {
        return _accountNumber;
    }

    public void set_accountNumber(int _accountNumber) {
        this._accountNumber = _accountNumber;
    }

    public float get_balance() {
        return _balance;
    }

    public void set_balance(float _balance) {
        this._balance = _balance;
    }

    public String get_customerName() {
        return _customerName;
    }

    public void set_customerName(String _customerName) {
        this._customerName = _customerName;
    }

    public String get_emailAddress() {
        return _emailAddress;
    }

    public void set_emailAddress(String _emailAddress) {
        this._emailAddress = _emailAddress;
    }

    public String get_phoneNumber() {
        return _phoneNumber;
    }

    public void set_phoneNumber(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }
    public float updateDepositFunds(float depositedMoney)
    {
        this._balance = _balance + depositedMoney;
        System.out.println("updated Balance Now "+ _balance);
        return  this._balance;
    }

    public float updateWithdrawnMoney(float withdrawnMoney)
    {
        if(this._balance - withdrawnMoney <0)
        {
            System.out.println("Sorry can't process this transaction !!! ");

        }else
        {
            this._balance -= withdrawnMoney;
            System.out.println("updated Balance Now "+ _balance);
        }
        return  this._balance;
    }
}

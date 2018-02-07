package com.mahesh;

public class Account {
    private String Number;
    private double accountbalance;
    private String customername;
    private String cutomerEmailID;
    private String cutomerphonenumber;

    public void deposit(double depositamount) {
        this.accountbalance += depositamount;
        System.out.println("deposite of " + depositamount + " Amount made. New balance is " + this.accountbalance);
    }

    public void withdrawal(double withdrawalamount) {
        if (this.accountbalance - withdrawalamount <=0) {
            System.out.println("Only balance available is " + this.accountbalance);
        }else{
            this.accountbalance -= withdrawalamount;
            System.out.println("Withdrowal of " +withdrawalamount + " process. Remaning balance = " + this.accountbalance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(double accountbalance) {
        this.accountbalance = accountbalance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCutomerEmailID() {
        return cutomerEmailID;
    }

    public void setCutomerEmailID(String cutomerEmailID) {
        this.cutomerEmailID = cutomerEmailID;
    }

    public String getCutomerphonenumber() {
        return cutomerphonenumber;
    }

    public void setCutomerphonenumber(String cutomerphonenumber) {
        this.cutomerphonenumber = cutomerphonenumber;
    }

}

package com.mahesh;

public class Main {

    public static void main (String[] args){

        Account bobsaccount=new Account();
        bobsaccount.withdrawal(100.0);

        bobsaccount.deposit(50.0);
        bobsaccount.withdrawal(100.0);

        bobsaccount.deposit(55.0);
        bobsaccount.withdrawal(90.0);
    }
}

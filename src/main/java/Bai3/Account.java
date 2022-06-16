package Bai3;

import java.util.Scanner;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance <0) {
            throw new RuntimeException("Balance is invalid");
        }
        this.balance = balance;
    }

    public int credit(int amount){
        if(amount<=0 ) {
            throw new RuntimeException("amount must be greater than zero");
        }
       return balance += amount;
    }

    public int debit(int amount){
        if(amount > balance ) {
            throw new RuntimeException("Amount exceeded balance");
        }
        else return balance -= amount;
    }

    //account là tài khoản gốc, account 1 là tài khoản chuyển tiền đến
    public int transferTo(Account anotherAccount,int amount){

        if(getId() == anotherAccount.getId()) System.out.println("tai khoan khong hop le");

        if(amount <= balance ) {
               balance -= amount;
               anotherAccount.credit(amount);
        }

        else throw new RuntimeException("Amount exceeded balance");
        return balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}

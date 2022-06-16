package Bai3;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("A123","Test",10000);
        Account account1 = new Account("B123","Test2",0);

        account.credit(20);
        account.debit(50);

    }
}

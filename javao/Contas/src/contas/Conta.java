package contas;

public class Conta {
    double balance;
    int number;
    String holder;
    static int counter = 0;

    public Conta(String holder, double balance){
        this.number = ++counter;
        this.balance = balance;
        this.holder = holder;
    }

    //Depósitar
    public void deposit(double amount){
        this.balance += amount;
    }

    //Sacar
    public boolean withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Saldo insuficiente, saque negado.");
            return false;
        }
    }

    // 'Conseguir' número
    public int getNumber() {
        return number;
    }

    // 'Conseguir' Saldo
    public double getBalance() {
        return balance;
    }


}

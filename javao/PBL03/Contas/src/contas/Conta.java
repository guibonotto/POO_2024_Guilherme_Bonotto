package contas;

public class Conta {
    private double balance;
    private int number;
    private String holder;
    private static int counter = 0;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

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
            System.out.println("Saque negado por saldo insuficiente");
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

package contas;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {


        ArrayList <Conta> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Olà, você está no gerenciador de contas");
            System.out.println("Digite a opção que vocÊ deseja:");
            System.out.println("1 - Criar uma conta");
            System.out.println("2 - Ver saldo da conta");
            System.out.println("3 - Depositar valor");
            System.out.println("4 - Sacar valor");

            System.out.println("Caso deseje finalizar: Digite outro número.");

            int chose = scanner.nextInt();

            switch (chose){
                case 1:
                    System.out.println("Digite o nome do titular:");
                    String holder = scanner.next();

                    System.out.println("Digite o saldo inicial da conta:");
                    double balance = scanner.nextDouble();

                    Conta newAccount = new Conta(holder,balance);

                    list.add(newAccount);

                    System.out.println("Conta criada com sucesso. Número da conta: " + newAccount.getNumber());


                    break;

                case 2:
                    System.out.println("Digite o número da conta:");
                    int numberAccount = scanner.nextInt();

                    Conta accountBalance = encontrarConta(list, numberAccount);
                    if (accountBalance != null) {
                        System.out.println(accountBalance.getHolder() + " seu saldo é de: " + "R$" + accountBalance.getBalance() );
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("Digite o número da conta:");

                    int numberAccountDeposit = scanner.nextInt();

                    Conta depositAccount = encontrarConta(list, numberAccountDeposit);

                    if(depositAccount != null){
                        System.out.println("Digite o valor a depositar:");
                        double depositValue = scanner.nextDouble();
                        depositAccount.deposit(depositValue);
                        System.out.println("Depósito realizado com sucesso. Novo saldo: " + depositAccount.getBalance());
                    }else{
                        System.out.println("Conta não encontrada");
                    }

                    break;

                case 4:
                    System.out.println("Digite o número da conta:");
                    int numberAccountWithdraw = scanner.nextInt();

                    Conta accountWithdraw = encontrarConta(list, numberAccountWithdraw);

                    if (accountWithdraw != null){
                        System.out.println(accountWithdraw.getHolder() + " seu saldo é de: " + "R$" + accountWithdraw.getBalance() );
                        System.out.println("Digite o valor que será sacado:");

                        double withdrawValue = scanner.nextDouble();

                        if(accountWithdraw.withdraw(withdrawValue)){
                            System.out.println("Valor sacado com sucesso");
                            System.out.println("Novo saldo:" + accountWithdraw.getBalance());
                        }else{
                            System.out.println("Saldo insuficiente.");}
                    }else{
                        System.out.println("Conta não encontrada.");
                    }
                    break;


                default:
                    System.out.println("Gerenciador finalizado.");
                    scanner.close();
                    return;
            }


        }
    }
    private static Conta encontrarConta(ArrayList<Conta> list, int numberAccount) {
        for (Conta conta : list) {
            if (conta.getNumber() == numberAccount) {
                return conta;
            }
        }
        return null;
    }
}

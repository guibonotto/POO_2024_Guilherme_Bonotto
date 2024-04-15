import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Escolha a operaçao \n 1.Somar \n 2.Subtrair \n 3.Multiplicar \n 4.Dividir \n 5.Sair");
            Integer opcao = scan.nextInt();
            if (opcao == 5){
                System.out.println("Saindo...");
                break;
            }

            System.out.println("Digite o primeiro valor: ");
            Double num1 = scan.nextDouble();
            System.out.println("Digite o segundo valor: ");
            Double num2 = scan.nextDouble();
            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + somar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + subtrair(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado: " + dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }
        }
    }

    private static double somar(double valor1, double valor2) {
        return valor1 + valor2;

    }

    private static double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    private static double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    private static double dividir(double valor1, double valor2) {
        return valor1 / valor2;
    }
}
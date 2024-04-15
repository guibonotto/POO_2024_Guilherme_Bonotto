import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> Persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            {
                System.out.println("==================================================================================================");
                System.out.println("Seja bem-vindo ao Sistema de cadastro PUCPR, digite o número da opção que deseja para prosseguir.");
                System.out.println("1)Cadastrar pessoa");
                System.out.println("2)Listar pessoas");
                System.out.println("3)Buscar pessoas por tipo");
                System.out.println("Digite qualquer outro número para encerrar o programa.");
                System.out.println("==================================================================================================");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Digite o seu nome:");
                        String name = scanner.next().toLowerCase();
                        name = name.substring(0, 1).toUpperCase() + name.substring(1);

                        System.out.println("Digite a sua idade (em anos):");
                        int age = scanner.nextInt();

                        System.out.println("Informe agora o seu tipo de conta:");
                        System.out.println("1)Cliente:");
                        System.out.println("2)Funcionário:");
                        System.out.println("3)Gerente:");
                        int type = scanner.nextInt();

                        String realType = "";
                        if (type == 1) {
                            realType = "Cliente";
                        } else if (type == 2) {
                            realType = "Funcionário";
                        } else if (type == 3) {
                            realType = "Gerente";
                        } else {
                            System.out.println("Opção inválida, Tente novamente");
                        }

                        if (!realType.isEmpty()) {
                            Person newPerson = new Person(name, age, realType);
                            Persons.add(newPerson);
                        }
                        break;
                    case 2:
                        System.out.println("Listagem de todas as pessoas: ");

                        for (Person subject : Persons) {
                            System.out.println("Nome:" + subject.getName() + " Idade:" + subject.getAge() + " Tipo:" + subject.getType());
                        }
                        break;
                    case 3:
                        System.out.println("Escolha o tipo de conta que você deseja filtrar:");
                        System.out.println("1)Cliente:");
                        System.out.println("2)Funcionário:");
                        System.out.println("3)Gerente:");

                        int choseType = scanner.nextInt();

                        switch (choseType) {
                            case 1:
                                for (Person person : Persons) {
                                    if (person.getType().equals("Cliente")) {
                                        System.out.println("Nome:" + person.getName() + " Idade:" + person.getAge());
                                    }
                                }
                                break;
                            case 2:
                                for (Person person : Persons) {
                                    if (person.getType().equals("Funcionário")) {
                                        System.out.println("Nome:" + person.getName() + " Idade:" + person.getAge());
                                    }
                                }
                                break;
                            case 3:
                                for (Person person : Persons) {
                                    if (person.getType().equals("Gerente")) {
                                        System.out.println("Nome:" + person.getName() + " Idade:" + person.getAge());
                                    }
                                }
                                break;


                        }
                }

            }
        }
    }
}
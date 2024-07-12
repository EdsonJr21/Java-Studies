import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Edson Júnior";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("***********************");

        boolean sair = false;

        while (!sair) {
            System.out.println("\nOperações");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.print("\nDigite a opção desejada: ");

            int opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Valor a ser recebido:");
                    double valorSendoRecebido = leitura.nextDouble();
                    saldo += valorSendoRecebido;
                    System.out.println("Novo Saldo: " + saldo);
                    break;
                case 3:
                    System.out.println("Valor a ser transferido: ");
                    double valorSendoTransferido = leitura.nextDouble();

                    if (valorSendoTransferido <= saldo){
                        saldo -= valorSendoTransferido;
                        System.out.println("Transferência realizada com sucesso!");
                        System.out.println("Novo saldo: R$ " + saldo);
                    }else {
                        System.out.println("Saldo insuficiente para a transferência.");

                    }
                    break;
                case 4:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;

            }
        }


    }
}
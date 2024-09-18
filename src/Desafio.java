import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Para iniciarmos digite seu nome");
        String nome = leitura.nextLine();
        System.out.println("Agora digite o tipo de conta");
        String conta = leitura.nextLine();
        double saldo = 0;
        int opcao = 0;

        System.out.println("**********************************\nBem vindo!");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("**********************************");

        String menu = """
                *** Digite sua opção ***
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor
                4 - Sair
                """;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao != 4) {
                System.out.println("Favor digitar um número válido");
            }
        }

    }
}

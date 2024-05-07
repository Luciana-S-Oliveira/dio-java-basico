import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
            int Numero = 1021;
            String Agencia = "067-8";
            String NomeCliente = " Mario Andrade ";
            Double Saldo = 237.48;

        System.out.println("Por favor, digite o número da conta: ");
        Numero = scanner.nextInt();

        System.out.println("Agora digite o número da Agência: ");
        Agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Informe seu nome: ");
        NomeCliente = scanner.next();
        scanner.nextLine();

        System.out.println("Agora informe seu saldo atual: ");
        Saldo = scanner.nextDouble();

        System.out.println();
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + Agencia + ", conta " + Numero + " e seu saldo é R$" + Saldo + ".");
        System.out.println("Seu saldo já está disponível para saque.");

        scanner.close();
    }
}

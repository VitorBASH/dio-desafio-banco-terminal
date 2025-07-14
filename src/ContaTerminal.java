import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        var numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        var agencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente !");
        var nome = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo !");
        var saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo $%.2f já está disponível para saque. \n",
        nome, agencia, numero, saldo);

        scanner.close();
    }
}
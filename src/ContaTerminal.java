import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Criando sua conta no banco");

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Digite 4 digitos de 1 a 9 para criar o número da sua agência: ");
        int numeroAgencia = sc.nextInt();

        System.out.println("Digite o saldo que você possui nessa conta: ");
        double saldo = sc.nextDouble();

        String agencia = numeroAgencia / 2 + "-4";

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f R$ já está disponível para saque!", nome, agencia, numeroAgencia, saldo );
    }
}

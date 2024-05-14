import java.text.MessageFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente; 
        float saldo;

        System.out.print("Olá usuario, por favor digite o seu nome: ");
        nomeCliente = leitor.nextLine();

        System.out.print("Digite o número da sua agencia: ");
        agencia = leitor.nextLine();

        System.out.print("Digite o número da sua conta: ");
        numero = leitor.nextInt();

        System.out.print("Digite o seu saldo: R$ ");
        saldo = leitor.nextFloat();

        System.out.println(MessageFormat.format("Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2}{3} já está disponível para saque", nomeCliente, agencia, numero, saldo));

        leitor.close();
    }
}

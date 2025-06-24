package Main;

import java.util.Locale;
import java.util.Scanner;

import Application.ContaTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Santander!");
        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Digite o número da agência: ");
        String agencia = sc.nextLine();

        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nomeCliente);

        System.out.print("Digite o valor do depósito inicial: ");
        double valorDeposito = sc.nextDouble();

        conta.depositar(valorDeposito);

        System.out.println("Olá " + conta.getNomeCliente()
                + ", obrigado por criar uma conta em nosso banco!, sua agência é "
                + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo já está disponível para saque");
        sc.close();
    }
}

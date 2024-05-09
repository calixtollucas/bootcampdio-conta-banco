package edu.rukadev.contabanco.app;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero = 0;
        String agency = "";
        String clientName = "";
        double currency = 0.0;

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("PROGRAMA DE CONTA BANCÁRIA");
        System.out.println("==========================");

        System.out.print("\nInsira o Número da conta: ");
        numero = input.nextInt();
        System.out.print("\nInsira o número da Agência: ");
        agency = input.next();
        System.out.print("\nDigite seu primeiro nome: ");
        clientName = input.next();
        System.out.print("\nDigite o saldo inicial: ");
        currency = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                            "conta %d e seu saldo %.2f já está disponível para saque", clientName, agency, numero, currency);

    }
}

package org.example;

import java.util.Scanner;

public class ContaTerminalJava {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Por favor, digite o número da Agência !");
        agencia = input.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        numero = input.nextInt();

        input.nextLine();

        System.out.println("Por favor, digite o seu Nome !");
        nome = input.nextLine();

        System.out.println("Por favor, digite o seu Saldo !");
        saldo = input.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}

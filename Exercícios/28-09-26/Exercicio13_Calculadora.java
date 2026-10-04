// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio13_Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        double num1 = entrada.nextDouble();
        System.out.println("Informe a operação (+, -, *, /):");
        String sinal = entrada.next();
        if (sinal.length() != 1) {
            System.out.println("Sinal Inválido.");

        } else if (sinal.equals("+") || sinal.equals("-") || sinal.equals("*") || sinal.equals("/")) {
            char operacao = sinal.charAt(0);
            System.out.println("Informe o segundo valor:");
            double num2 = entrada.nextDouble();
            if (operacao == '+') {
                System.out.println("Resultado: " + (num1 + num2));
            } else if (operacao == '-') {
                System.out.println("Resultado: " + (num1 - num2));
            } else if (operacao == '*') {
                System.out.println("Resultado: " + (num1 * num2));
            } else if (operacao == '/' && num2 > 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else if (operacao == '/' && num2 <= 0) {
                System.out.println("Impossível dividir!");
            }
        } else {
            System.out.println("Sinal Inválido.");
        }
        entrada.close();
    }
}
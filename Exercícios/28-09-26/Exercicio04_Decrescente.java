// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio04_Decrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double a = entrada.nextDouble();
        System.out.println("Digite o segundo número:");
        double b = entrada.nextDouble();

        if (a == b) {
            System.out.println("Os números não podem ser iguais.");
        } else if (a > b) {
            System.out.println(a + "; " + b);
        } else if (a < b) {
            System.out.println(b + "; " + a);
        }
        entrada.close();
    }
}
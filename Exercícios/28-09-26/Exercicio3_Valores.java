// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio3_Valores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int diferenca;
        System.out.println("Digite o primeiro número:");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        int b = entrada.nextInt();

        if (a == b) {
            System.out.println("Os número são iguais.");
        } else if (a > b) {
            diferenca = a - b;
            System.out.println("O primeiro número é " + diferenca + " a mais que o segundo.");
        } else if (a < b) {
            diferenca = b - a;
            System.out.println("O segundo número é " + diferenca + " a mais que o primeiro.");
        }
        entrada.close();
    }
}
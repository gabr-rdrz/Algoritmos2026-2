// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio05_Intervalo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int a = entrada.nextInt();

        if (a >= 50 && a <= 100) {
            System.out.println("Pertence ao intervalo.");
        } else {
            System.out.println("Não pertence ao intervalo.");
        }
        entrada.close();
    }
}
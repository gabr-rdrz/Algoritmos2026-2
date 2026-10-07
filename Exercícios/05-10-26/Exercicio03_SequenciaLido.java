// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio03_SequenciaLido {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = entrada.nextInt();

        for (int seq = 1; seq <= num; seq++) {
            System.out.println(seq);
        }
        entrada.close();
    }
}
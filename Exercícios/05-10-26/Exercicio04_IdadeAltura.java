// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio04_IdadeAltura {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        float idade, altura, quantIdade, quantAltura, mediaIdade;
        float acumuladorIdade = 0;
        float acumuladorAltura = 0;
        double mediaAltura;

        // Idade
        System.out.println("Indique a idade de 10 pessoas:");
        for (quantIdade = 0; quantIdade < 10; quantIdade++) {
            System.out.print("Idade: ");
            idade = entrada.nextFloat();
            acumuladorIdade += idade;
        }
        // Altura
        System.out.println("Indique a altura em metros de 10 pessoas (ex: 1,75):");
        for (quantAltura = 0; quantAltura < 10; quantAltura++) {
            System.out.print("Altura: ");
            altura = entrada.nextFloat();
            acumuladorAltura += altura;
        }
        // Média
        mediaIdade = acumuladorIdade / quantIdade;
        System.out.println("A média das idades é: " + mediaIdade + " anos.");
        mediaAltura = acumuladorAltura / quantAltura;
        System.out.println("A média das alturas é: " + mediaAltura + " metros.");

        entrada.close();
    }
}
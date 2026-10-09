// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio04_IdadeAltura {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        float quantAltura, idadeCinquenta = 0, acumuladorAltura = 0;

        // Idade e altura
        System.out.println("Indique a idade e a altura de 10 pessoas. Digite a altura em metros (ex: 1,75):");
        System.out.println("");
        for (quantAltura = 0; quantAltura < 10; quantAltura++) {
        }
        for (int pessoa = 1; pessoa <= 10; pessoa++) {
            System.out.println(pessoa + "ª pessoa: ");
            System.out.print("Idade: ");
            float idade = entrada.nextFloat();
            System.out.print("Altura: ");
            float altura = entrada.nextFloat();
            System.out.println("--------------------------------");

            if (idade > 50) {
                idadeCinquenta++;
                acumuladorAltura += altura;
            }
        }
        // Média
        if (idadeCinquenta > 0) {
            double mediaAltura = acumuladorAltura / idadeCinquenta;
            System.out.println("A média das alturas das pessoas com mais de 50 anos é " + mediaAltura + " metros.");
        } else {
            System.out.println("Não há pessoas com mais de 50 anos, portanto, não é possível calcular a média das alturas.");
        }
        entrada.close();
    }
}
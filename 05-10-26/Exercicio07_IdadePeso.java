// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077
 
import java.util.Scanner;

public class Exercicio07_IdadePeso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float quantAltura, idadeDezVinte = 0, pesoQuarenta = 0, acumuladorAltura = 0;
        int idadeCinquenta = 0;

        // Idade, altura e peso
        System.out.println("Indique a idade, a altura e o peso de 10 pessoas. Digite a altura em metros (ex: 1,75) e o peso em quilos (ex: 60,5):");
        System.out.println("");
        for (quantAltura = 0; quantAltura < 10; quantAltura++) {
        }
        for (int pessoa = 1; pessoa <= 10; pessoa++) {
            System.out.println(pessoa + "ª pessoa: ");
            System.out.print("Idade: ");
            float idade = entrada.nextFloat();
            System.out.print("Altura: ");
            float altura = entrada.nextFloat();
            System.out.print("Peso: ");
            float peso = entrada.nextFloat();
            System.out.println("--------------------------------");

            if (idade >= 10 && idade <= 20) {
                idadeDezVinte++;
                acumuladorAltura += altura;
            } else if (idade > 50) {
                idadeCinquenta++;
            } if (peso < 40) {
                pesoQuarenta++;
            }
        }
        // Média, quantidade e percentual
        float percentual = pesoQuarenta * 10;

        System.out.println("A quantidade de pessoas maiores de 50 anos é " + idadeCinquenta);
        if (idadeDezVinte > 0) {
            float mediaAltura = acumuladorAltura / idadeDezVinte;
            System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos é " + mediaAltura + " metros.");
        } else {
            System.out.println("Não há pessoas entre 10 e 20 anos, portanto, não é possível calcular a média das alturas.");
        }
        System.out.println("O percentual de pessoas com peso inferior a 40 quilos é " + percentual + "%");
        entrada.close();
    }
}
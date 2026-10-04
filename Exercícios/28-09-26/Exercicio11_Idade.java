// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio11_Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Indique a sua idade:");
        int idade = entrada.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Você pertence à categoria Infantil-A.");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Você pertence à categoria Infantil-B.");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Você pertence à categoria Juvenil-A.");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Você pertence à categoria Juvenil-B.");
        } else if (idade >= 18) {
            System.out.println("Você pertence à categoria Sênior.");
        } else {
            System.out.println("Idade insuficiente: a idade mínima para competir é de 5 anos.");
        }
        entrada.close();
    }
}
// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio10_MaiorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = entrada.nextInt();
        System.out.println("Digite o terceiro número:");
        int num3 = entrada.nextInt();

        // Cenários onde apenas um número é o "maior"
        if (num1 == num2 && num1 == num3) {
            System.out.println("Os números são iguais.");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("O número " + num1 + " é o maior entre os três.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O número " + num2 + " é o maior entre os três.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O número " + num3 + " é o maior entre os três.");

        // Cenários onde dois números são "maiores"
        } else if (num1 == num2 && num1 > num3) {
            System.out.println("Os dois maiores números são iguais a " + num1 + ".");
        } else if (num1 == num3 && num1 > num2) {
            System.out.println("Os dois maiores números são iguais a " + num1 + ".");
        } else if (num2 == num3 && num2 > num1) {
            System.out.println("Os dois maiores números são iguais a " + num2 + ".");
        }
        entrada.close();
    }
}
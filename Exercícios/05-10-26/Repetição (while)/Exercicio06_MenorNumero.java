// Nome: Gabriel Rodrigues —— RA: 12526215077

import java.util.Scanner;

public class Exercicio06_MenorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1, numMenor = Integer.MAX_VALUE;
        System.out.println("Digite 10 números inteiros e positivos:");
        do {
            System.out.print(contador + "º número: ");
            int num = entrada.nextInt();

            if (num <= 0) {
                System.out.println("Número inválido. Por favor, digite novamente. ");
            } else {
                if (num <= numMenor) {
                    numMenor = num;
                }
                contador++;
            }
        } while (contador <= 10);
        System.out.println("\nO menor número é " + numMenor);

        entrada.close();
    }
}

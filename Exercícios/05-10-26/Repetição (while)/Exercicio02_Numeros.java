// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio02_Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1, totalPar = 0, totalImpar = 0;
        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = entrada.nextInt();
            contador++;
        
            int resto = numero % 2;
            if (resto == 0) {
                totalPar++;
            } else {
                totalImpar++;
            }
        }
        System.out.println("\nO total de pares é " + totalPar);
        System.out.println("O total de ímpares é " + totalImpar);
        
        entrada.close();
    }
}
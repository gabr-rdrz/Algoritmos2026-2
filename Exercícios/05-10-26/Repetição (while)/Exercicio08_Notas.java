// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio08_Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        System.out.println("Indique duas notas de 5 alunos.");
        System.out.println("----------------------------------------");
        do {
            System.out.print(contador + "º aluno: ");
            System.out.print("\nNota 1: ");
            float nota1 = entrada.nextFloat();
            if (nota1 < 0 || nota1 > 10) {
                do {
                    System.out.print("Nota inválida. Por favor, digite novamente: ");
                    nota1 = entrada.nextFloat();
                } while (nota1 < 0 || nota1 > 10);
            }
            System.out.print("Nota 2: ");
            float nota2 = entrada.nextFloat();
            if (nota2 < 0 || nota2 > 10) {
                do {
                    System.out.print("Nota inválida. Por favor, digite novamente: ");
                    nota2 = entrada.nextFloat();
                } while (nota2 < 0 || nota2 > 10);
            }
            float media = (nota1 + nota2) / 2;
            System.out.println("A média das notas é " + media);
            System.out.println("----------------------------------------");
            contador++;
        } while (contador <= 5);
        entrada.close();
    }
}
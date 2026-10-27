// Nome: Gabriel Rodrigues —— RA: 12526215077

import java.util.Scanner;

public class Exercicio07_IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1, imcSaudavel = 0;
        System.out.println("Indique a altura e o peso de 10 pessoas.");
        System.out.println("----------------------------------------");
        do {
            System.out.print(contador + "ª pessoa: ");
            System.out.print("\nAltura: ");
            float altura = entrada.nextFloat();
            System.out.print("Peso: ");
            float peso = entrada.nextFloat();
            System.out.println("----------------------------------------");

            float imc = peso / (altura * altura);
            if (imc >= 18.5 && imc <= 24.9) {
                imcSaudavel++;
            }
            contador++;
        } while (contador <= 10);
        System.out.println(imcSaudavel + " pessoas estão com o IMC entre 18,5 e 24,9 (sem obesidade).");

        entrada.close();
    }
}

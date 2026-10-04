// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio06_Peso {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Indique o seu sexo:");
        System.out.println("[1] Masculino");
        System.out.println("[2] Feminino");
        int sexo = entrada.nextInt();

        if (sexo == 1) {
            System.out.println("Digite a sua altura em metros (ex: 1,75):");
            double altura = entrada.nextDouble();
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal estimado é de " + pesoIdeal + " kg.");

        } else if (sexo == 2) {
            System.out.println("Digite a sua altura em metros (ex: 1,75):");
            double altura = entrada.nextDouble();
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O seu peso ideal estimado é de " + pesoIdeal + " kg.");

        } else {
            System.out.println("Opção inválida. Por favor, escolha entre as opções 1 ou 2.");
        }
        entrada.close();
    }
}
// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio07_Bonus {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Indique o seu salário:");
        double salario = entrada.nextDouble();
        System.out.println("Indique o seu tempo na empresa em anos:");
        double anos = entrada.nextDouble();

        if (anos >= 5) {
            double bonus = salario * 0.2;
            System.out.println("Você tem direito a um bônus de R$ " + bonus);

        } else {
            double bonus = salario * 0.1;
            System.out.println("Você tem direito a um bônus de R$ " + bonus);
        }
        entrada.close();
    }
}
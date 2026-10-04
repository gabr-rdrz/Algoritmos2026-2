// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio12_INSS {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu salário:");
        double salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Desconto do INSS: Isento");
        } else if (salario > 600 && salario <= 1200) {
            double desconto = salario * 0.2;
            System.out.println("Desconto do INSS: 20% | Valor retido: R$ " + desconto);
        } else if (salario > 1200 && salario <= 2000) {
            double desconto = salario * 0.25;
            System.out.println("Desconto do INSS: 25% | Valor retido: R$ " + desconto);
        } else if (salario > 2000) {
            double desconto = salario * 0.3;
            System.out.println("Desconto do INSS: 30% | Valor retido: R$ " + desconto);
        } 
        entrada.close();
    }
}
// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio09_Prestacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu salário bruto:");
        double salario = entrada.nextDouble();
        System.out.println("Informe o valor da parcela mensal desejada:");
        double prestacao = entrada.nextDouble();

        if (prestacao <= salario * 0.3) {
            System.out.println("Empréstimo aprovado! Parcela fixada em R$ " + prestacao);
        } else {
            System.out.println("Empréstimo reprovado: o valor da parcela excede o limite de 30% do salário.");
        }
        entrada.close();
    }
}
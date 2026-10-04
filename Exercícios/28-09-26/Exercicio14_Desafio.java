// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio14_Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a sua nacionalidade:");
        System.out.println("[1] Brasileiro(a)");
        System.out.println("[2] Outro(a)");
        int naci = entrada.nextInt();
        System.out.println("Informe a sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Informe a regularidade do seu título:");
        System.out.println("[1] Título regular");
        System.out.println("[2] Título cancelado");
        System.out.println("[3] Título suspenso");
        System.out.println("[4] Não possui título");
        int titulo = entrada.nextInt();
        System.out.println("Informe a sua situação perante o serviço militar:");
        System.out.println("[1] Cidadão comum, dispensado, reservista ou militar de carreira");
        System.out.println("[2] Conscrito (cumprindo o serviço militar obrigatório atualmente)");
        int servico = entrada.nextInt();

        if (naci != 1 || idade < 16 || titulo != 1 || servico != 1) {
            System.out.println("Você não está apto a votar.");
        } else {
            System.out.println("Você está apto a votar.");
        }
        entrada.close();
    }
}
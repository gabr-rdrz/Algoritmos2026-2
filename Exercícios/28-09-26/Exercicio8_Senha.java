// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio8_Senha {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua senha:");
        String senha = entrada.next();

        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Acesso negado.");
        }
        entrada.close();
    }
}
// Nome: Gabriel Rodrigues —— RA: 12526215077

import java.util.Scanner;

public class Exercicio03_Multiplicacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int sequencia = 1;
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        while (sequencia <= numero) {
            if (sequencia * 2 <= numero) {
                System.out.print(sequencia + ", ");
            }
            else {
                System.out.println(sequencia);
            }
            sequencia *= 2;
        }
        entrada.close();
    }
}

// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077
 
import java.util.Scanner;

public class Exercicio03_Periodo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o período em que você estuda:");
        System.out.println("[M] Matutino");
        System.out.println("[V] Vespertino");
        System.out.println("[N] Noturno");
        System.out.println("-------------------------------------");
        String stPeriodo = entrada.next();
            
        if (stPeriodo.length() != 1) {
            System.out.println("Período inexistente! Por favor, escolha uma opção válida (M, V ou N)");
        } else {
            char chPeriodo = stPeriodo.charAt(0);
            
            switch (chPeriodo) {
                case 'M', 'm':
                    System.out.println("Bom dia!");
                    break;
                case 'V', 'v':
                    System.out.println("Boa tarde!");
                    break;
                case 'N', 'n':
                    System.out.println("Boa noite!");
                    break;
                default:
                    System.out.println("Período inexistente! Por favor, escolha uma opção válida (M, V ou N).");
                    break;
            }
            entrada.close();
        }
    }
}
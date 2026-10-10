// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077
 
import java.util.Scanner;

public class Exercicio01_Dia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o dia (1 a 7): ");
        int dia = entrada.nextInt();
            
        switch (dia) {
            case 1:
                System.out.println("Hoje é domingo.");
                break;
            case 2:
                System.out.println("Hoje é segunda-feira.");
                break;
            case 3:
                System.out.println("Hoje é terça-feira.");
                break;
            case 4:
                System.out.println("Hoje é quarta-feira.");
                break;
            case 5:
                System.out.println("Hoje é quinta-feira.");
                break;
            case 6:
                System.out.println("Hoje é sexta-feira.");
                break;
            case 7:
                System.out.println("Hoje é sábado.");
                break;
            default:
                System.out.println("Dia inexistente! Por favor, escolha um número válido de 1 a 7.");
                break;
        }
        entrada.close();
    }
}
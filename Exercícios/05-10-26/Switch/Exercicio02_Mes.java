// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077
 
import java.util.Scanner;

public class Exercicio02_Mes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o mês (1 a 12): ");
        int mes = entrada.nextInt();
            
        switch (mes) {
            case 1:
                System.out.println("Estamos em janeiro.");
                break;
            case 2:
                System.out.println("Estamos em fevereiro.");
                break;
            case 3:
                System.out.println("Estamos em março.");
                break;
            case 4:
                System.out.println("Estamos em abril.");
                break;
            case 5:
                System.out.println("Estamos em maio.");
                break;
            case 6:
                System.out.println("Estamos em junho.");
                break;
            case 7:
                System.out.println("Estamos em julho.");
                break;
            case 8:
                System.out.println("Estamos em agosto.");
                break;
            case 9:
                System.out.println("Estamos em setembro.");
                break;
            case 10:
                System.out.println("Estamos em outubro.");
                break;
            case 11:
                System.out.println("Estamos em novembro.");
                break;
            case 12:
                System.out.println("Estamos em dezembro.");
                break;
            default:
                System.out.println("Mês inexistente! Por favor, escolha um número válido de 1 a 12.");
                break;
        }
        entrada.close();
    }
}
// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077
 
import java.util.Scanner;

public class Exercicio05_Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Insira o segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.println("-------------------------------------");
        System.out.println("Escolha uma das opções para calcular:");
        System.out.println("[M] Média entre os números digitados.");
        System.out.println("[S] Diferença do maior pelo menor.");
        System.out.println("[P] Produto entre os números digitados.");
        System.out.println("[D] Divisão do primeiro pelo segundo.");
        System.out.println("-------------------------------------");
        String stOpcao = entrada.next();

        if (stOpcao.length() != 1) {
            System.out.println("Opção inexistente! Por favor, escolha uma opção válida (M, S, P ou D).");
        } else {
            char chOpcao = stOpcao.charAt(0);
            
        switch (chOpcao) {
            case 'M', 'm':
                System.out.println("A média entre os números é " + (num1 + num2) / 2);
                break;
            case 'S', 's':
                if (num1 > num2) {
                    System.out.println("A diferença do maior pelo menor é: " + (num1 - num2));
                } else {
                    System.out.println("A diferença do maior pelo menor é: " + (num2 - num1));
                }
                break;
            case 'P', 'p':
                System.out.println("O produto da multiplicação é: " + num1 * num2);
                break;
            case 'D', 'd':
                if (num2 == 0) {
                    System.out.println("Não é possível dividir um número por zero.");
                } else {
                    System.out.println("O resultado da divisão é: " + num1 / num2);
                }
                break;
            default:
                System.out.println("Opção inexistente! Por favor, escolha uma opção válida (M, S, P ou D).");
                break;
            }
        }
        entrada.close();
    }
}
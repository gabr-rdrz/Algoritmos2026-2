// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077
 
import java.util.Scanner;

public class Exercicio04_Aumento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double novoSalario;

        System.out.print("Informe o seu salário: ");
        double salario = entrada.nextDouble();
        System.out.println("-------------------------------------");
        System.out.println("Informe o plano de trabalho:");
        System.out.println("[A] Plano A");
        System.out.println("[B] Plano B");
        System.out.println("[C] Plano C");
        System.out.println("-------------------------------------");
        String stPlano = entrada.next();

        if (stPlano.length() != 1) {
            System.out.println("Plano inexistente! Por favor, escolha uma opção válida (A, B ou C).");
        } else {
            char chPlano = stPlano.charAt(0);
            
            switch (chPlano) {
            case 'A', 'a':
                novoSalario = salario * 1.10;
                System.out.println("O seu novo salário será R$ " + novoSalario);
                break;
            case 'B', 'b':
                novoSalario = salario * 1.15;
                System.out.println("O seu novo salário será R$ " + novoSalario);
                break;
            case 'C', 'c':
                novoSalario = salario * 1.20;
                System.out.println("O seu novo salário será R$ " + novoSalario);
                break;
            default:
                System.out.println("Plano inexistente! Por favor, escolha uma opção válida (A, B ou C).");
                break;
            }
        }
        entrada.close();
    }
}
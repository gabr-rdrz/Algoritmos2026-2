// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077
 
import java.util.Scanner;

public class Exercicio06_Eleicao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, nulo = 0, branco = 0;

        System.out.println("Opções de votos:");
        System.out.println("[1] Candidato 1");
        System.out.println("[2] Candidato 2");
        System.out.println("[3] Candidato 3");
        System.out.println("[4] Candidato 4");
        System.out.println("[5] Nulo");
        System.out.println("[6] Branco");
        System.out.println("--------------------------------");

        // Registro dos votos
        for (int eleitor = 1; eleitor <= 10; eleitor++) {
            System.out.print("Eleitor " + eleitor + ": Registre seu voto: ");
            int voto = entrada.nextInt();
            
            switch (voto) {
                case 1 : voto1++; break;
                case 2: voto2++; break;
                case 3: voto3++; break;
                case 4: voto4++; break;
                case 5: nulo++; break;
                case 6: branco++; break;
                default:
                    System.out.println("Voto inválido! Tente novamente.");
                    eleitor--;
                    break;
            }
        }
        // Resultado dos votos
        System.out.println("--------------------------------");
        System.out.println("Total de votos para o candidato 1: " + voto1);
        System.out.println("Total de votos para o candidato 2: " + voto2);
        System.out.println("Total de votos para o candidato 3: " + voto3);
        System.out.println("Total de votos para o candidato 4: " + voto4);
        System.out.println("Total de votos nulos: " + nulo);
        System.out.println("Total de votos brancos: " + branco);
        System.out.println("--------------------------------");

        int percentual = (branco + nulo) * 10;
        System.out.println("O percentual dos votos brancos e nulos foi de " + percentual + "%");
        entrada.close();
    }
}
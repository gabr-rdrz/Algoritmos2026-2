// Nome: Gabriel Rodrigues —— RA: 12526215077
 
import java.util.Scanner;

public class Exercicio09_Cardapio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int pergunta;
        double preco = 0, precoTotal = 0;

        System.out.println("-------------Cardápio-------------");
        System.out.println("Código | Produto         | Preço");
        System.out.println("[100]  | Cachorro Quente | R$ 1,20");
        System.out.println("[101]  | Bauru Simples   | R$ 1,30");
        System.out.println("[102]  | Bauru com Ovo   | R$ 1,50");
        System.out.println("[103]  | Hambúrguer      | R$ 1,20");
        System.out.println("[104]  | Cheeseburguer   | R$ 1,30");
        System.out.println("[105]  | Refrigerante    | R$ 1,00");
        System.out.println("----------------------------------");

        do {
            System.out.println("Informe o código do produto desejado: ");
            int codigo = entrada.nextInt();

            if (codigo >= 100 && codigo <= 105) {
                System.out.println("Informe a quantidade desejada: ");
                int quantidade = entrada.nextInt();

                switch (codigo) {
                    case 100:
                        preco = quantidade * 1.2;
                        if (quantidade == 1) {
                            System.out.println("Você pediu " + quantidade + " Cachorro Quente. | Valor a ser pago: R$ " + preco);
                        } else if (quantidade > 1) {
                            System.out.println("Você pediu " + quantidade + " Cachorros Quentes. | Valor a ser pago: R$ " + preco);
                        } else {
                            System.out.println("Você não pediu nenhuma unidade. | Valor a ser pago: R$ 0.0");
                        }
                        break;
                    case 101:
                        preco = quantidade * 1.3;
                        if (quantidade == 1) {
                            System.out.println("Você pediu " + quantidade + " Bauru Simples. | Valor a ser pago: R$ " + preco);
                        } else if (quantidade > 1) {
                            System.out.println("Você pediu " + quantidade + " Baurus Simples. | Valor a ser pago: R$ " + preco);
                        } else {
                            System.out.println("Você não pediu nenhuma unidade. | Valor a ser pago: R$ 0.0");
                        }
                        break;
                    case 102:
                        preco = quantidade * 1.5;
                        if (quantidade == 1) {
                            System.out.println("Você pediu " + quantidade + " Bauru com Ovo. | Valor a ser pago: R$ " + preco);
                        } else if (quantidade > 1) {
                            System.out.println("Você pediu " + quantidade + " Baurus com Ovos. | Valor a ser pago: R$ " + preco);
                        } else {
                            System.out.println("Você não pediu nenhuma unidade. | Valor a ser pago: R$ 0.0");
                        }
                        break;
                    case 103:
                        preco = quantidade * 1.2;
                        if (quantidade == 1) {
                            System.out.println("Você pediu " + quantidade + " Hambúrguer. | Valor a ser pago: R$ " + preco);
                        } else if (quantidade > 1) {
                            System.out.println("Você pediu " + quantidade + " Hambúrgueres. | Valor a ser pago: R$ " + preco);
                        } else {
                            System.out.println("Você não pediu nenhuma unidade. | Valor a ser pago: R$ 0.0");
                        }
                        break;
                    case 104:
                        preco = quantidade * 1.3;
                        if (quantidade == 1) {
                            System.out.println("Você pediu " + quantidade + " Cheeseburguer. | Valor a ser pago: R$ " + preco);
                        } else if (quantidade > 1) {
                            System.out.println("Você pediu " + quantidade + " Cheeseburgers. | Valor a ser pago: R$ " + preco);
                        } else {
                            System.out.println("Você não pediu nenhuma unidade. | Valor a ser pago: R$ 0.0");
                        }
                        break;
                    case 105:
                        preco = quantidade * 1.0;
                        if (quantidade == 1) {
                            System.out.println("Você pediu " + quantidade + " Refrigerante. | Valor a ser pago: R$ " + preco);
                        } else if (quantidade > 1) {
                            System.out.println("Você pediu " + quantidade + " Refrigerantes. | Valor a ser pago: R$ " + preco);
                        } else {
                            System.out.println("Você não pediu nenhuma unidade. | Valor a ser pago: R$ 0.0");
                        }
                        break;
                }
                precoTotal += preco;

            } else {
                System.out.println("Produto inexistente! Por favor, escolha um código válido (100 a 105):");
            }
            System.out.println("Deseja continuar comprando?");
            System.out.println("[1] Sim | [2] Não");
            pergunta = entrada.nextInt();
            
            if (pergunta != 1 && pergunta != 2) {
                do {
                    System.out.println("Resposta inválida! Por favor, escolha uma opção válida (1/2):");
                    pergunta = entrada.nextInt();
                } while (pergunta != 1 && pergunta != 2);
            }
            System.out.println("----------------------------------");
        } while (pergunta == 1);
        System.out.println("Valor total a ser pago: R$ " + precoTotal);
    }
}

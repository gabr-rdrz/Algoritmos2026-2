// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077
 
import java.util.Scanner;

public class Exercicio06_Cardapio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double preco;

        System.out.println("-------------Cardápio-------------");
        System.out.println("Código | Produto         | Preço");
        System.out.println("[100]  | Cachorro Quente | R$ 1,20");
        System.out.println("[101]  | Bauru Simples   | R$ 1,30");
        System.out.println("[102]  | Bauru com Ovo   | R$ 1,50");
        System.out.println("[103]  | Hambúrguer      | R$ 1,20");
        System.out.println("[104]  | Cheeseburguer   | R$ 1,30");
        System.out.println("[105]  | Refrigerante    | R$ 1,00");
        System.out.println("----------------------------------");

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
        } else {
            System.out.println("Produto inexistente! Por favor, escolha um código válido (100 a 105).");
        }
        entrada.close();
    }
}
import java.util.Scanner;

public class Exercicio06_Eleicao {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, nota5, nota6, quantNota1, quantNota2, quantNota3, quantNota4, quantNota5, quantNota6, mediaNota1, mediaNota2, mediaNota3, mediaNota4, mediaNota5, mediaNota6, mediaClasse, notasClasse;
        double acumuladorNota1 = 0, acumuladorNota2 = 0, acumuladorNota3 = 0, acumuladorNota4 = 0, acumuladorNota5 = 0, acumuladorNota6 = 0, aprovado = 0, reprovado = 0, exame = 0, totalAprovados = 0, totalReprovados = 0, totalExames = 0;

        // Entrada: 1º aluno
        System.out.println("Indique as duas notas do 1º aluno:");
        for (quantNota1 = 0; quantNota1 < 2; quantNota1++) {
            System.out.print("Nota: ");
            nota1 = entrada.nextDouble();
            acumuladorNota1 += nota1;
        }
        // Entrada: 2º aluno
        System.out.println("Indique as duas notas do 2º aluno:");
        for (quantNota2 = 0; quantNota2 < 2; quantNota2++) {
            System.out.print("Nota: ");
            nota2 = entrada.nextDouble();
            acumuladorNota2 += nota2;
        }
        // Entrada: 3º aluno
        System.out.println("Indique as duas notas do 3º aluno:");
        for (quantNota3 = 0; quantNota3 < 2; quantNota3++) {
            System.out.print("Nota: ");
            nota3 = entrada.nextDouble();
            acumuladorNota3 += nota3;
        }
        // Entrada: 4º aluno
        System.out.println("Indique as duas notas do 4º aluno:");
        for (quantNota4 = 0; quantNota4 < 2; quantNota4++) {
            System.out.print("Nota: ");
            nota4 = entrada.nextDouble();
            acumuladorNota4 += nota4;
        }
        // Entrada: 5º aluno
        System.out.println("Indique as duas notas do 5º aluno:");
        for (quantNota5 = 0; quantNota5 < 2; quantNota5++) {
            System.out.print("Nota: ");
            nota5 = entrada.nextDouble();
            acumuladorNota5 += nota5;
        }
        // Entrada: 6º aluno
        System.out.println("Indique as duas notas do 6º aluno:");
        for (quantNota6 = 0; quantNota6 < 2; quantNota6++) {
            System.out.print("Nota: ");
            nota6 = entrada.nextDouble();
            acumuladorNota6 += nota6;
        }
        // Cálculo das Médias
        mediaNota1 = acumuladorNota1 / quantNota1;
        mediaNota2 = acumuladorNota2 / quantNota2;
        mediaNota3 = acumuladorNota3 / quantNota3;
        mediaNota4 = acumuladorNota4 / quantNota4;
        mediaNota5 = acumuladorNota5 / quantNota5;
        mediaNota6 = acumuladorNota6 / quantNota6;
        System.out.println("");

        // Média do 1º aluno
        if (mediaNota1 <= 3) {
            System.out.println("A média das notas do 1º aluno é " + mediaNota1 + " | Resultado: Reprovado.");
            reprovado += 1;
        } else if (mediaNota1 > 3 && mediaNota1 < 7) {
            exame += 1;
            System.out.println("A média das notas do 1º aluno é " + mediaNota1 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média das notas do 1º aluno é " + mediaNota1 + " | Resultado: Aprovado.");
        }
        // Média do 2º aluno
        if (mediaNota2 <= 3) {
            reprovado += 1;
            System.out.println("A média das notas do 2º aluno é " + mediaNota2 + " | Resultado: Reprovado.");
        } else if (mediaNota2 > 3 && mediaNota2 < 7) {
            exame += 1;
            System.out.println("A média das notas do 2º aluno é " + mediaNota2 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média das notas do 2º aluno é " + mediaNota2 + " | Resultado: Aprovado.");
        }
        // Média do 3º aluno
        if (mediaNota3 <= 3) {
            reprovado += 1;
            System.out.println("A média das notas do 3º aluno é " + mediaNota3 + " | Resultado: Reprovado.");
        } else if (mediaNota3 > 3 && mediaNota3 < 7) {
            exame += 1;
            System.out.println("A média das notas do 3º aluno é " + mediaNota3 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média das notas do 3º aluno é " + mediaNota3 + " | Resultado: Aprovado.");
        }
        // Média do 4º aluno
        if (mediaNota4 <= 3) {
            reprovado += 1;
            System.out.println("A média das notas do 4º aluno é " + mediaNota4 + " | Resultado: Reprovado.");
        } else if (mediaNota4 > 3 && mediaNota4 < 7) {
            exame += 1;
            System.out.println("A média das notas do 4º aluno é " + mediaNota4 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média das notas do 4º aluno é " + mediaNota4 + " | Resultado: Aprovado.");
        }
        // Média do do 5º aluno
        if (mediaNota5 <= 3) {
            reprovado += 1;
            System.out.println("A média das notas do 5º aluno é " + mediaNota5 + " | Resultado: Reprovado.");
        } else if (mediaNota5 > 3 && mediaNota5 < 7) {
            exame += 1;
            System.out.println("A média das notas do 5º aluno é " + mediaNota5 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média das notas do 5º aluno é " + mediaNota5 + " | Resultado: Aprovado.");
        }
        // Média do do 6º aluno
        if (mediaNota6 <= 3) {
            reprovado += 1;
            System.out.println("A média das notas do 6º aluno é " + mediaNota6 + " | Resultado: Reprovado.");
        } else if (mediaNota6 > 3 && mediaNota6 < 7) {
            exame += 1;
            System.out.println("A média das notas do 6º aluno é " + mediaNota6 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média das notas do 6º aluno é " + mediaNota6 + " | Resultado: Aprovado.");
        }
        // Média da classe
        System.out.println("");
        notasClasse = mediaNota1 + mediaNota2 + mediaNota3 + mediaNota4 + mediaNota5 + mediaNota6;
        mediaClasse = notasClasse / 6;
        System.out.println("A média das notas da classe é " + mediaClasse);

        // Total de alunos aprovados, reprovados ou elegíveis
        System.out.println("");
        totalAprovados += aprovado;
        totalExames += exame;
        totalReprovados += reprovado;

        if (totalAprovados <= 1) {
            System.out.println(totalAprovados + " aluno foi aprovado.");
        } else {
            System.out.println(totalAprovados + " alunos foram aprovados.");
        }
        if (totalExames <= 1) {
            System.out.println(totalExames + " aluno está elegível para o exame.");
        } else {
            System.out.println(totalExames + " alunos estão elegíveis para os exames.");
        }
        if (totalReprovados <= 1) {
            System.out.println(totalReprovados + " aluno foi reprovado.");
        } else {
            System.out.println(totalReprovados + " alunos foram reprovados.");
        }
        System.out.println("");
        entrada.close();
    }
}
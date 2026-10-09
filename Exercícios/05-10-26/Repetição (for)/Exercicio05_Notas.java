// Nome: Gabriel Rodrigues Rufacho de Souza —— RA: 12526215077

import java.util.Scanner;

public class Exercicio05_Notas {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        double quantNota1, quantNota2, quantNota3, quantNota4, quantNota5, quantNota6;
        double acumuladorNota1 = 0, acumuladorNota2 = 0, acumuladorNota3 = 0, acumuladorNota4 = 0, acumuladorNota5 = 0, acumuladorNota6 = 0;
        int aprovado = 0, reprovado = 0, exame = 0, totalAprovados = 0, totalReprovados = 0, totalExames = 0;

        // 1º aluno: Notas e média
        System.out.println("Indique as notas do 1º aluno:");
        for (quantNota1 = 0; quantNota1 < 2; quantNota1++) {
        }
        for (int nota = 1; nota <= 2; nota++) {
            System.out.print("Nota " + nota + ": ");
            double nota1 = entrada.nextDouble();
            acumuladorNota1 += nota1;
        }
        double mediaNota1 = acumuladorNota1 / quantNota1;
        if (mediaNota1 <= 3) {
        System.out.println("A média é " + mediaNota1 + " | Resultado: Reprovado.");
        reprovado += 1;
        } else if (mediaNota1 > 3 && mediaNota1 < 7) {
            exame += 1;
            System.out.println("A média é " + mediaNota1 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média é " + mediaNota1 + " | Resultado: Aprovado.");
        }
        // 2º aluno: Notas e média
        System.out.println("-----------------------------------------------");
        System.out.println("Indique as notas do 2º aluno:");
        for (quantNota2 = 0; quantNota2 < 2; quantNota2++) {
        }
        for (int nota = 1; nota <= 2; nota++) {
            System.out.print("Nota " + nota + ": ");
            double nota2 = entrada.nextDouble();
            acumuladorNota2 += nota2;
        }
        double mediaNota2 = acumuladorNota2 / quantNota2;
        if (mediaNota2 <= 3) {
        System.out.println("A média é " + mediaNota2 + " | Resultado: Reprovado.");
        reprovado += 1;
        } else if (mediaNota2 > 3 && mediaNota2 < 7) {
            exame += 1;
            System.out.println("A média é " + mediaNota2 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média é " + mediaNota2 + " | Resultado: Aprovado.");
        }
        // 3º aluno: Notas e média
        System.out.println("-----------------------------------------------");
        System.out.println("Indique as notas do 3º aluno:");
        for (quantNota3 = 0; quantNota3 < 2; quantNota3++) {
        }
        for (int nota = 1; nota <= 2; nota++) {
            System.out.print("Nota " + nota + ": ");
            double nota3 = entrada.nextDouble();
            acumuladorNota3 += nota3;
        }
        double mediaNota3 = acumuladorNota3 / quantNota3;
        if (mediaNota3 <= 3) {
        System.out.println("A média é " + mediaNota3 + " | Resultado: Reprovado.");
        reprovado += 1;
        } else if (mediaNota3 > 3 && mediaNota3 < 7) {
            exame += 1;
            System.out.println("A média é " + mediaNota3 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média é " + mediaNota3 + " | Resultado: Aprovado.");
        }
        // 4º aluno: Notas e média
        System.out.println("-----------------------------------------------");
        System.out.println("Indique as notas do 4º aluno:");
        for (quantNota4 = 0; quantNota4 < 2; quantNota4++) {
        }
        for (int nota = 1; nota <= 2; nota++) {
            System.out.print("Nota " + nota + ": ");
            double nota4 = entrada.nextDouble();
            acumuladorNota4 += nota4;
        }
        double mediaNota4 = acumuladorNota4 / quantNota4;
        if (mediaNota4 <= 3) {
        System.out.println("A média é " + mediaNota4 + " | Resultado: Reprovado.");
        reprovado += 1;
        } else if (mediaNota4 > 3 && mediaNota4 < 7) {
            exame += 1;
            System.out.println("A média é " + mediaNota4 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média é " + mediaNota4 + " | Resultado: Aprovado.");
        }
        // 5º aluno: Notas e média
        System.out.println("-----------------------------------------------");
        System.out.println("Indique as notas do 5º aluno:");
        for (quantNota5 = 0; quantNota5 < 2; quantNota5++) {
        }
        for (int nota = 1; nota <= 2; nota++) {
            System.out.print("Nota " + nota + ": ");
            double nota5 = entrada.nextDouble();
            acumuladorNota5 += nota5;
        }
        double mediaNota5 = acumuladorNota5 / quantNota5;
        if (mediaNota5 <= 3) {
        System.out.println("A média é " + mediaNota5 + " | Resultado: Reprovado.");
        reprovado += 1;
        } else if (mediaNota5 > 3 && mediaNota5 < 7) {
            exame += 1;
            System.out.println("A média é " + mediaNota5 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média é " + mediaNota5 + " | Resultado: Aprovado.");
        }
        // 6º aluno: Notas e média
        System.out.println("-----------------------------------------------");
        System.out.println("Indique as notas do 6º aluno:");
        for (quantNota6 = 0; quantNota6 < 2; quantNota6++) {
        }
        for (int nota = 1; nota <= 2; nota++) {
            System.out.print("Nota " + nota + ": ");
            double nota6 = entrada.nextDouble();
            acumuladorNota6 += nota6;
        }
        double mediaNota6 = acumuladorNota6 / quantNota6;
        if (mediaNota6 <= 3) {
        System.out.println("A média é " + mediaNota6 + " | Resultado: Reprovado.");
        reprovado += 1;
        } else if (mediaNota6 > 3 && mediaNota6 < 7) {
            exame += 1;
            System.out.println("A média é " + mediaNota6 + " | Resultado: Elegível para Exame.");
        } else {
            aprovado += 1;
            System.out.println("A média é " + mediaNota6 + " | Resultado: Aprovado.");
        }
        // Classe: Notas e média
        System.out.println("-----------------------------------------------");
        double mediaClasse = (mediaNota1 + mediaNota2 + mediaNota3 + mediaNota4 + mediaNota5 + mediaNota6) / 6;
        System.out.println("A média da classe é " + mediaClasse);

        System.out.println("-----------------------------------------------");
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
        System.out.println("-----------------------------------------------");
        entrada.close();
    }
}
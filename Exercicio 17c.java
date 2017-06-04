package aula17c;

import java.util.Scanner;

public class Aula17c {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantidade de boletins que vão ser cadastrados?");
        int totalBoletins = leitor.nextInt();
        leitor.nextLine();
        String[] boletins = new String[totalBoletins];

        for (int h = 0; h < totalBoletins; h++) {
            System.out.println("Digite o nome do aluno " + (h + 1));
            String nome = leitor.nextLine();
            System.out.println("Digite a nota 1 do aluno " + nome);
            double nota1 = leitor.nextDouble();
            leitor.nextLine();
            System.out.println("Digite a nota 2 do aluno " + nome);
            double nota2 = leitor.nextDouble();
            leitor.nextLine();
            double media = ((nota1 + nota2) / 2);
            boletins[h] = (h + 1) + ". " + nome + ". Média " + media + ". " + (media >= 5 ? "A" : "RE") + "PROVADO";
        }
        for (int h = 0; h < totalBoletins; h++) {
            System.out.println(boletins[h]);
        }

    }
}



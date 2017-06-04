package aula17b;

import java.util.Scanner;

public class Aula17b {

    // Powereed by Henrique Treza
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantidade de produto comprado?");
        int produtos = leitor.nextInt();
        leitor.nextLine();
        double[] precos = new double[produtos];
        for (int h = 0; h < produtos; h++) {
            int produtoAtual = h + 1;
            System.out.println("Digite o valor do produto " + produtoAtual);
            double preco = leitor.nextDouble();
            leitor.nextLine();
            System.out.println("Digite a quantidade de produtos comprados?");
            int quantidade = leitor.nextInt();
            leitor.nextLine();
            precos[h] = preco * quantidade;
        }

        for (int h = 0; h < produtos; h++) {
            System.out.println("Valor total da compra do produto " + (h + 1) + " é " + precos[h]);
        }
    }
}


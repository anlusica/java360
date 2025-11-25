package exercicios;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        // CALCULANDO A MÉDIA DAS NOTAS DE UM ALUNO
        // Crie um programa que calcula a média das notas de um aluno.
        // São 3 notas, e elas devem ser fornecidas pelo usuário.
        // Dica: a conversão de String para double pode ser feita com o uso do método Double.parseDouble()

        var scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a nota 2: ");
        double nota2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a nota 3: ");
        double nota3 = Double.parseDouble(scanner.nextLine());

        System.out.println("A média do aluno é: " + (nota1+nota2+nota3)/3);

    }
}

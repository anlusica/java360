package exercicios;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

        // CALCULANDO A MÉDIA DE UM NÚMERO VARIÁVEL DE NOTAS
        // Escreva um programa que calcula a média de notas de um aluno.
        // As notas devem ser fornecidas via teclado pelo usuário.
        // O usuário pode fornecer quantas notas desejar.
        // Quando um ENTER for pressionado sem fornecer uma nota, o programa calcula a média das notas fornecidas previamente e termina.

        var scanner = new Scanner(System.in);

        int contaNotas = 0;
        double somaNotas = 0;
        String nota = "0";

        while(!nota.isBlank()) {
            System.out.print("Nota: ");
            nota = scanner.nextLine();

            if (!nota.isBlank()) {
                somaNotas += Double.parseDouble(nota);
                contaNotas++;
            }
        }

        if(contaNotas == 0)
            System.out.println("Média: " + 0.0);
        else
            System.out.println("Media: " + somaNotas/contaNotas);

    }
}

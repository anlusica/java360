package exercicios;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        // GERANDO A TABUADA DE UM NÚMERO
        // Escreva um programa que gera a tabuada de um número.
        // O número deve ser fornecido pelo usuário.
        // Os valores na tabuada devem variar de 1 a 10.

        var scanner = new Scanner(System.in);

        System.out.print("Tabuada: ");
        int tab = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= 10; i++)
            System.out.println(tab + " x " + i + " = " + (tab*i));

    }
}

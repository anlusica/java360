package exercicios;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        // DESCOBRINDO O DIA DA SEMANA
        // Escreva um programa que retorna o nome do dia da semana com base em um número fornecido.
        // O primeiro dia da semana é o DOMINGO, e corresponde ao número 1.
        // Utilize uma estrutura switch para resolver o exercício.

        var scanner = new Scanner(System.in);
        System.out.print("Dia: ");

        int dia = Integer.parseInt(scanner.nextLine());

        String nomeDiaSemana = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Dia Inválido";
        };

        System.out.print(nomeDiaSemana);

    }
}

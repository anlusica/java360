package exercicios;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        // CONVERTENDO A TEMPERATURA
        // Escreva um programa que converte o valor de uma temperatura em graus Fahrenheit para graus Celsius.
        // A temperatura deve ser fornecida pelo usuário.
        // A fórmula de conversão é essa: TC = ((TF - 32) / 9) * 5

        var scanner = new Scanner(System.in);

        System.out.print("Temperatura Fahrenheit: ");
        double tf = Double.parseDouble(scanner.nextLine());

        double tc = ( (tf - 32) / 9 ) * 5;

        System.out.print("Temperatura Celsius: " + tc);

    }
}

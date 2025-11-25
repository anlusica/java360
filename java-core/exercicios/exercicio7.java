package exercicios;

public class exercicio7 {

    public static void main(String[] args) {

        // SOMANDO NÚMEROS PARES DE UM INTERVALO
        // Escreva um programa que soma todos os números pares do intervalo de 0 a 100.

        int soma = 0;

        for(int i = 0; i <= 100; i++) {
            if(i % 2 == 0)
                soma += i;
        }

        System.out.println("Resultado: " + soma);

    }
}
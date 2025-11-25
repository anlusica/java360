package exercicios;

public class exercicio4 {

    public static void main(String[] args) {

        // CALCULANDO OS VALORES DE X
        // Escreva um programa que imprime na saída os valores assumidos por x.
        // Esta variável x deve iniciar com algum valor escolhido por você.
        // Se x for par, x deve receber o valor dele mesmo somado com 5.
        // Se x for ímpar, x deve receber o valor dele multiplicado por 2.
        // Utilize a estrutura if-else para resolver o exercício.

        int x = 10;

        if (x % 2 == 0) {
            System.out.println(x + 5);
        } else {
            System.out.println(x * 2);
        }

    }

}

package br.com.javainsider.exercicios;

public class exercicio1 {

    // CRIANDO UMA FRAÇÃO E MULTIPLICANDO POR OUTRA FRAÇÃO
    // Crie uma classe Fraction, que representa uma fração matemática.
    // Esta classe deve ser capaz de armazenar o numerador e o denominador da fração.
    // Ela ainda deve ter métodos que recebem uma fração como parâmetro,
    // multiplicando ambas as frações, e retornam uma nova fração como resultado.
    // Crie um programa que instancia duas frações, define seus valores, calcula o
    // valor da multiplicação entre elas e mostra o resultado.
    // Dica: a multiplicação de 2 frações é feita através da multiplicação dos
    // numeradores e dos denominadores das frações, e o valor resultante é uma terceira fração.

    public static void main(String[] args) {

        Fraction f1 = new Fraction();
        f1.numerador = 2;
        f1.denominador = 2;

        Fraction f2 = new Fraction();
        f2.numerador = 3;
        f2.denominador = 4;

        var result = f1.Multiplicacao(f2);
        System.out.println(result);

    }

}



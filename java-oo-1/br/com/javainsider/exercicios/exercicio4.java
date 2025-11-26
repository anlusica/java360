package br.com.javainsider.exercicios;

public class exercicio4 {

    // CRIANDO UM RETÂNGULO
    // Crie uma classe Rectangle para representar um retângulo.
    // O retângulo deve armazenar as informações do tamanho dos seus dois lados
    // Para criar um retângulo, os tamanhos dos lados devem ser fornecidos.
    // Alternativamente, se ambos os lados forem do mesmo tamanho, apenas um valor pode ser fornecido.
    // Depois de criado, os lados não podem ser alterados.
    // Crie um método square(), que retorna a área do retângulo (basta multiplicar os tamanhos dos dois lados).
    // Crie um programa que exercita o que foi especificado acima.

    public static void main(String[] args) {

        Rectangle retangulo1 = new Rectangle(2,2);
        System.out.println(retangulo1.square());

        Rectangle retangulo2 = new Rectangle(3);
        System.out.println(retangulo2.square());

    }

}

class Rectangle {

    private final double lado1;
    private final double lado2;

    public Rectangle(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangle(double lado) {
        this(lado, lado);
    }

    public double square() {
        return this.lado1 * this.lado2;
    }

}

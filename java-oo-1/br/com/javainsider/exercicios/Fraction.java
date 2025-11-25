package br.com.javainsider.exercicios;

public class Fraction {

    public int numerador;
    public int denominador;

    public Fraction Multiplicacao(Fraction x) {
        this.numerador = this.numerador * x.numerador;
        this.denominador = this.denominador * x.denominador;
        return this;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }
}

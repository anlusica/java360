package exercicios;

public class exercicio5 {

    public static void main(String[] args) {

        // CALCULANDO O VALOR DA MULTA POR EXCESSO DE VELOCIDADE
        // Escreva um programa que calcula o valor de uma multa de trânsito por excesso de velocidade.
        // O valor da multa é R$ 10 para cada Km/h acima da velocidade do veículo considerada e que excede a velocidade permitida.
        // A velocidade permitida deve ser parametrizável
        // A velocidade considerada depende da velocidade permitida:
        // Para uma velocidade permitida até 100 Km/h, a velocidade considerada é 7 Km/h a mais do que a velocidade do veículo.
        // Para velocidades permitidas acima de 100 Km/h, a velocidade considerada é 10% a mais do que a velocidade do veículo.

        int allowed = 100;
        int current = 100;
        int amount;

        if (allowed < current) {

            int considered;

            if (allowed < 100) {
                considered = current + 7;
            } else {
                considered = current + (int) (current * 0.1);
            }

            int diff = considered - allowed;
            amount = diff * 10;

        } else {
            amount = 0;
        }

        System.out.println("Multa: " + amount);

    }
}

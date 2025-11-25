package exercicios;

import java.sql.SQLOutput;

public class exercicio1 {

    public static void main(String[] args) {

        // RESOLVENDO UMA EXPRESSÃO PASSO A PASSO
        // Usando papel e caneta, encontre o resultado da seguinte expressão:
        // 15 - 5 * 2 > (3 - 1) / 2 && 4 <= 2 * 2 || !(2 != 4)

        boolean exp = 15 - 5 * 2 > (3 - 1) / 2 && 4 <= 2 * 2 || !(2 != 4);
        System.out.println(exp);

    }
}

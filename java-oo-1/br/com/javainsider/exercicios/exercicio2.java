package br.com.javainsider.exercicios;

public class exercicio2 {

    // IMPLEMENTANDO UM RELÓGIO
    // Crie as classes Watch e Pointer de acordo com o diagrama abaixo.
    // Os ponteiros podem assumir as posições 1, 2, 3, 4 e assim por diante.
    // Se o ponteiro dos minutos está na posição 3, significa que o método readMinute() deve retornar 15,
    // que é o minuto que corresponde a esta posição.
    // O mesmo vale para o ponteiro das horas e dos segundos.
    // No método settime() você deve passar a hora, minuto e segundo.
    // Suponha que o horário fornecido seja 3, 25 minutos e 50 segundos.
    // O ponteiro das horas deve ser posicionado no 3, o dos minutos no 5 e o dos segundos no 10.

    public static void main(String[] args) {

        Watch w = new Watch();
        w.setTime(11, 30, 40);
        w.getTime();

    }


}

package br.com.javainsider.exercicios;

public class exercicio3 {

    // CRIANDO UMA LAMPADA
    // Crie uma classe Lamp que possui um atributo "on", o qual indica se a lâmpada está ligada ou desligada.
    // Ao construir uma lâmpada, o estado dela (ligada ou desligada) deve ser fornecido.
    // Para ligar ou desligar a lâmpada, os métodos turnOn() e turnOff() devem ser chamados, respectivamente.
    // Aliás, esta é a única forma de alterar o estado da lâmpada, já que o atributo "on" não deve ser visível fora da classe.
    // A lâmpada também deve possuir um método showState().
    // Quando chamado, ele mostra as mensagens "Lampada Ligada" ou "Lampada desligada", dependendo do estado atual.
    // Construa uma aplicação que cria uma lâmpada ligada, muda o estado dela e também imprime o estado atual após cada
    // chamada aos métodos turnOn() e turnOff().

    public static void main(String[] args) {
        Lamp lamp = new Lamp(true);
        lamp.showState();
        lamp.turnOff();
        lamp.showState();
        lamp.turnOn();
        lamp.showState();
    }
}


class Lamp {

    private boolean on;

    public Lamp(boolean on) {
        this.on = on;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void showState() {
        if (on) {
            System.out.println("Lâmpada Ligada");
        } else {
            System.out.println("Lâmpada Desligada");
        }
    }
}

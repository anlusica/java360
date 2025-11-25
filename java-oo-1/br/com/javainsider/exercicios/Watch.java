package br.com.javainsider.exercicios;

public class Watch {

    public Pointer hour = new Pointer();
    public Pointer minute = new Pointer();
    public Pointer second = new Pointer();

    public void setTime(int hour, int minute, int second) {
        this.hour.number = hour;
        this.minute.number = minute;
        this.second.number = second;
    }

    public int readHour() {
        return this.hour.number;
    }

    public int readMinute() {
        return this.minute.number / 5;
    }

    public int readSecond() {
        return this.second.number / 5;
    }

    public void getTime() {
        System.out.println(Integer.toString(readHour()) + "\n" + Integer.toString(readMinute()) + "\n" + Integer.toString(readSecond()));
    }
}

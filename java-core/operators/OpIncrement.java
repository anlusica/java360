package operators;

public class OpIncrement {

    public static void main(String[] args) {

        int a = 2;
        int b = 3 + ++a;

        System.out.println(a);
        System.out.println(b);
    }
}

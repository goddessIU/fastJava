class Number {
    int i;
}

public class Assignment {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 99;
        n2.i = 88;
        System.out.println(n1.i);
    }
}
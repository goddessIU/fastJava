import java.util.Date;

/**
 */

class Number {
    int i;
}

public  class HelloDate {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();

        n1.i = 9;
        n2.i = 47;

        System.out.println(n1.i);
        System.out.println(n2.i);

        n1 = n2;

        System.out.println(n1.i);
    }
}
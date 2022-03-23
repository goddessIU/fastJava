import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class chap4 {

}

class Measurement {
    String a;
    int b;
    void print() {
        System.out.println(a);
        System.out.println(b);
    }
}

class Cup {
    Cup(int marker) {
        System.out.println(marker);
    }
    void f(int marker) {
        System.out.println(marker);
    }
}

class Cups {
    static Cup c1;
    static Cup c2;
    static {
        c1 = new Cup(1);
        c2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }
}


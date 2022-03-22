public  class inner {
    public static void main(String[] args) {
        Outer outer = new Outer("bbb");
        Outer.Inner ainner = outer.new Inner();
        Outer.StatciNested st = new Outer.StatciNested();
        st.hello();
    }
}

class Outer {
    private String name;
    private static String NAME = "mmm";

    Outer(String name) {
        this.name = name;
    }

    class Inner {
        void hello() {
            System.out.println(Outer.this.name);
        }
    }

    static class StatciNested {
        void hello() {
            System.out.println(Outer.NAME);
        }
    }
}
public class DotNew {
    void f() {}
    public class Inner {
        public DotNew outer() {
            return DotNew.this;
        }
    }
    public Inner inner() {return new Inner();}

    public static void main(String[] args) {
        DotNew dt = new DotNew();
        DotNew.Inner dti = dt.inner();
        dti.outer().f();
    }
}
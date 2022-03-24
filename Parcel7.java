public class Parcel7 {
    class Wrapping {
        private int i;
        public Wrapping(int x) {i = x;}
        public int value() {return i;}
    }
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Wrapping w = p.wrapping(10);
    }
}
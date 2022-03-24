//public class Prac9 {
//
//}
//
//class Instrument {
//    public void play(Note n) {
//        System.out.println();
//    }
//}
//
//enum Note {
//    MIDDLE_C, C_SHARP, B_FLAT;
//}
//
//class Wind extends Instrument {
//    @Override
//    public void play(Note n) {
//        System.out.println(n);
//    }
//}
//
//class Music {
//    public static void tune(Instrument i) {
//        i.play(Note.MIDDLE_C);
//    }
//
//    public static void main(String[] args) {
//        Wind flute = new Wind();
//        tune(flute)
//    }
//}
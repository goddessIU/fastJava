import java.util.Random;

public  class chap3 {
//    static void usage() {
//        System.out.println("Usage: \n\t" + "lower" + "uperr");
//        System.exit(1);
//    }
    public static void main(String[] args) {
        System.out.println(args.length);
//        if (args.length != 1) usage();
        if (args[0].equals("lower")) {
            while (Math.random() != 0.0) {
                System.out.println("Produced 0.0");
            }
        } else if (args[0].equals("upper")) {
            while (Math.random() != 1.0) {
                System.out.println("Produced .10");
            }
        } else {
//            usage();
        }
    }
}

class Letter {
    char c;
}
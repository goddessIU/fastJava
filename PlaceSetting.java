import org.w3c.dom.ls.LSOutput;

class Plate {
    Plate(int i) {

    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("Dinner");
    }
}

class Utensil {
    Utensil(int i) {

    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println();
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println();
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
    }
}

class Custom {
    Custom(int i) {
        System.out.println();
    }
}

public class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private DinnerPlate pl;
    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i +2);
        frk = new Fork(i +3);
        pl = new DinnerPlate(i + 5);
        System.out.println();
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting((9));
    }
}
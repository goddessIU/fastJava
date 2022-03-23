class Personn {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println(peeled);
        System.out.println("yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args) {
        new Personn().eat(new Apple());
    }
}
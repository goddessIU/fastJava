class Shape {
    void draw() {}
    void erase() {}
}

class Circle extends Shape {
    void draw() {
        System.out.println();
    }
    void erase() {

    }
}

class Square extends Shape {
    void draw() {

    }
    void erase() {

    }
}

class Triangle extends Shape {

}

public class Shapes {
    public static Shape randShae() {
        switch((int)(Math.random() * 3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

    public static void main(String[] args) {
        Shape[] s= new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = randShae();

        }
        for (int i = 0; i < s.length; i++) {
            s[i].draw();
        }
    }
}
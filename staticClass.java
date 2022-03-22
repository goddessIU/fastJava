public class staticClass {
    public static void main(String[] args) {
        Person.setNumber(88);
        System.out.println(Person.num);
    }
}

class Person {
    public static int num = 99;

    public static void setNumber(int value) {
        num = value;
    }
}
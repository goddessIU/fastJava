import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fan{
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(123, 456);
        int n = add(p);
        System.out.println(n);
    }
    static int add(Pair<? extends Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }
}



class Person111 implements Comparable<Person111> {
    String name;
    int score;
    Person111(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public int compareTo(Person111 other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return this.name + "," + this.score;
    }
}

class Pair<T> {
    private T first;
    private T last;
    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst() {
        return this.first;
    }
    public T getLast() {
        return this.last;
    }
}
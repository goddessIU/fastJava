import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public  class Collection {

    public static void main(String[] args) {
        List<Person11> list = List.of(
                new Person11("x", 1),
                new Person11("a", 1),
                new Person11("b", 2)
        );
        System.out.println(list.contains(new Person11("x", 1)));
    }
}

class Person11 {
    String name;
    int age;
    public Person11(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o instanceof Person11) {
            Person11 p = (Person11) o;
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }
}
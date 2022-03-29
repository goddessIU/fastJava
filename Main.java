import java.util.HashMap;
import java.util.Map;

public  class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 111);
        map.put("b", 222);
        map.put("c", 333);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + value);
        }
    }
}

class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
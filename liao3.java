//public  class liao3 {
//    public static void main(String[] args) {
//        Student stu = new Student("sb", 33, 1);
//        stu.setAge(11);
//        System.out.println(stu.getAge());
//        System.out.println(stu.hello());
//
//        //向上转型
//        Person p = stu;
//        Object o1 = p;
//        Object o2 = stu;
//
//        //向下转型
//        Person p1 = new Student();
//        Person p2 = new Person();
//        System.out.println(p2 instanceof Student);
//        Student s1 = (Student) p1;
//        Student s2 = (Student) p2;
//    }
//}
//
//class Person {
//    protected String name;
//    protected int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person() {
//
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {}
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//
//}
//
//class Student extends Person{
//    private int score;
//    protected Book book;
//
//    public Student(String name, int age, int score) {
//        super(name, age);
//        this.score = score;
//    }
//
//    public Student() {
//        super();
//    }
//
//    public int getScore() {
//        return this.score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//
//    public String hello() {
//        return super.name;
//    }
//}
//
//class Book {
//    protected String name;
//    public String getName() {...}
//    public void setName(String name) {...}
//}
//public class polymorphism {
//    public void runTwice(Person p) {
//        p.run();
//        p.run();
//    }
//    public static double totalTax(Income... incomes) {
//        double total = 0;
//        for (Income income: incomes) {
//            total += income.getTax();
//        }
//        return total;
//    }
//    public static void main(String[] args) {
////        Income[] incomes = new Income[] {
////                new Income(3000),
////                new Salary(7500),
////                new StateCouncilSpecialAllowance(15000)
////        };
////        System.out.println(totalTax(incomes));
//
//        Person p = new Person();
//        System.out.println(p.toString());
//    }
//}
//
//class Person {
//    protected  String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public final String sayHello() {
//        return "hello" + this.name;
//    }
//
//    public void run() {
//        System.out.println("Person.run");
//    }
//
//    @Override
//    public String toString() {
//        return "dsb, Person";
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof Person) {
//            Person p = (Person) o;
//            return this.name.equals(p.name);
//        }
//
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return this.name.hashCode();
//    }
//}
//
//class Student extends  Person {
//    public Student(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println("bbb");
//    }
//
//
//}
//
//class Income {
//    protected double income;
//
//    public Income(double income) {
//        this.income = income;
//    }
//
//    public double getTax() {
//        return income * 0.1;
//    }
//}
//
//class Salary extends Income {
//    public Salary(double income) {
//        super(income);
//    }
//
//    @Override
//    public double getTax() {
//        if (income <= 500) {
//            return 0;
//        }
//        return income - 500;
//    }
//}
//
//class StateCouncilSpecialAllowance extends Income {
//    public StateCouncilSpecialAllowance(double income) {
//        super(income);
//    }
//
//    @Override
//    public double getTax() {
//        return 0;
//    }
//}
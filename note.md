```java
// housekeeping/StaticInitialization.java
// Specifying initial values in a class definition

class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }
    
    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    
    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }
    
    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }
    
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    
    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    
    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }
    
    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("main creating new Cupboard()");
        new Cupboard();
        System.out.println("main creating new Cupboard()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
```
结果
```java
Bowl(1)
Bowl(2)
Table()
f1(1)
Bowl(4)
Bowl(5)
Bowl(3)
Cupboard()
f1(2)
main creating new Cupboard()
Bowl(3)
Cupboard()
f1(2)
main creating new Cupboard()
Bowl(3)
Cupboard()
f1(2)
f2(1)
f3(1)

```

由输出可见，静态初始化只有在必要时刻才会进行。如果不创建 Table 对象，也不引用 Table.bowl1 或 Table.bowl2，那么静态的 Bowl 类对象 bowl1 和 bowl2 永远不会被创建。只有在第一个 Table 对象被创建（或被访问）时，它们才会被初始化。此后，静态对象不会再次被初始化。

初始化的顺序先是静态对象（如果它们之前没有被初始化的话），然后是非静态对象，从输出中可以看出。要执行 main() 方法，必须加载 StaticInitialization 类，它的静态属性 table 和 cupboard 随后被初始化，这会导致它们对应的类也被加载，而由于它们都包含静态的 Bowl 对象，所以 Bowl 类也会被加载。因此，在这个特殊的程序中，所有的类都会在 main() 方法之前被加载。实际情况通常并非如此，因为在典型的程序中，不会像本例中所示的那样，将所有事物通过 static 联系起来。


```java
// housekeeping/ExplicitStatic.java
// Explicit static initialization with "static" clause

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    
    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99); // [1]
    }
    
    // static Cups cups1 = new Cups(); // [2]
    // static Cups cups2 = new Cups(); // [2]
}

```

```java
Inside main()
Cup(1)
Cup(2)
f(99)

```

无论是通过标为 [1] 的行访问静态的 cup1 对象，还是把标为 [1] 的行去掉，让它去运行标为 [2] 的那行代码（去掉 [2] 的注释），Cups 的静态初始化动作都会执行。如果同时注释 [1] 和 [2] 处，那么 Cups 的静态初始化就不会进行。此外，把标为 [2] 处的注释都去掉还是只去掉一个，静态初始化只会执行一次。
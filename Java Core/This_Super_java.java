
class A {

    public A() {
        System.out.println("In A");
    }

    public A(int a) {
        System.out.println("Int A in");
    }
}

class B extends A {

    public B() {
        super();   //By default take super class
        // super(5);
        System.out.println("In B");
    }

    public B(int b) {
        // super();
        // super(b);
        this();
        System.out.println("Int B in");
    }
}

public class This_Super_java {

    public static void main(String[] args) {
        B obj1 = new B(5);
        // B obj2 = new B();
    }
}


class A {

    public void show() {
        System.out.println("In a show of A");
    }

    public void config() {
        System.err.println("In a config");
    }
}

class B extends A {

    @Override
    public void show() {
        System.out.println("In a show of B");
    }
}

public class Method_Overriding {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}


class Human {

    public Human() {
        System.out.println("I am human");
    }
}

class Man extends Human {

    public Man() {
        System.out.println("I am man");
    }
}

public class Inheritance_java {

    public static void main(String[] args) {
        Man obj = new Man();
    }
}


class Mobile {

    String brand;
    int price;
    static String name;

    public void show() {
        System.err.println(brand + " " + price + " " + name);
    }
}

public class Static_keyword {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        // obj1.name = "Smart Phone";
        Mobile.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Nokia";
        obj2.price = 500;
        // obj2.name = "Hand Phone";
        Mobile.name = "Hand Phone";

        Mobile.name = "phone";

        obj1.show();
        obj2.show();
    }
}

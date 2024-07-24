
class Human {

    private int age;
    private String name;

    public Human() {    //Default constructor
        age = 24;
        name = "Satish";
    }

    public Human(int age, String name) {  // Parameteriged constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor_java {

    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human();
        Human obj3 = new Human(35, "Anurag");

        obj1.setAge(42);
        obj1.setName("Souma");

        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
        System.out.println(obj3.getName() + " : " + obj3.getAge());
    }
}


class Human {

    private int age;
    private String name;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

}

public class Encapsulate_Java {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(42);
        obj.setName("Anurag");
        System.out.println(obj.getName() + " " + obj.getAge());
    }
}

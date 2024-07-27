import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public String toString() {
    return "Student [age=" + age + " name=" + name + "]";
  }
}

public class ShortByAge {
  public static void main(String args[]) {
    Comparator<Student> com = new Comparator<Student>() {
      public int compare(Student i, Student j) {
        if (i.age > j.age) {
          return 1;
        } else
          return -1;
      }
    };

    List<Student> studs = new ArrayList<>();
    studs.add(new Student(23, "Akash"));
    studs.add(new Student(25, "Harsh"));
    studs.add(new Student(29, "Ajoy"));
    studs.add(new Student(15, "Shamal"));

    Collections.sort(studs, com);
    for (Student s : studs) {
      System.out.println(s);
    }
  }
}

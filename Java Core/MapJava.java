import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapJava {
  public static void main(String args[]) {
    // Map<String, Integer> students = new HashMap<>();
    Map<String, Integer> students = new Hashtable<>();

    students.put("Ajoy", 74);
    students.put("Harsh", 79);
    students.put("Akash", 52);
    students.put("Sandeep", 82);
    students.put("Siddhant", 39);

    // System.out.println(students);
    System.out.println(students.keySet());

    for (String key : students.keySet()) {
      System.out.println(key + " : " + students.get(key));
    }
  }
}

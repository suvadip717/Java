import java.util.*;

public class InterfacesCollection {
  public static void main(String args[]) {
    // Collection<Integer> nums = new ArrayList<Integer>();
    // List<Integer> nums = new ArrayList<Integer>();
    // Set<Integer> nums = new HashSet<Integer>();
    // Set<Integer> nums = new TreeSet<Integer>();
    Collection<Integer> nums = new TreeSet<Integer>();
    nums.add(52);
    nums.add(81);
    nums.add(38);
    nums.add(73);
    nums.add(10);
    nums.add(27);
    nums.add(83);

    // System.out.println(nums.indexOf(10));
    // System.out.println(nums.get(2));

    Iterator<Integer> values = nums.iterator();
    while (values.hasNext())
      System.out.println(values.next());

    // for (int n : nums) {
    // System.out.println(n);
    // }
  }
}

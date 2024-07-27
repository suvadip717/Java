import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNumber {
  public static void main(String args[]) {
    List<Integer> nums = new ArrayList<>();

    nums.add(34);
    nums.add(92);
    nums.add(63);
    nums.add(47);

    Collections.sort(nums);
    System.out.println(nums);
  }
}

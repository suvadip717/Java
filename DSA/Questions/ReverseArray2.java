import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray2 {
    public static void main(String[] args) {
        List <Integer> array = new ArrayList<>(Arrays.asList(7,2,3,9,1,10,5));
        Collections.reverse(array);

        for(int i=0; i<array.size(); i++){
            System.out.print(array.get(i)+" ");
        }
        System.out.println();
    }
}

// Time Complexity: O(n)
// Auxiliary Space: O(1) 
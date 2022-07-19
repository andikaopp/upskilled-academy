import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(11);
        System.out.println("Array Input: "+numbers);

        HashSet<Integer> arrResult = new HashSet<>(numbers);
        System.out.println(arrResult.size());
    }
}

import java.util.Arrays;
import java.util.List;

public class FindMinMax {
    public static void main(String[] args) {
        Integer[] array = {5,7,4,1,3,8};
        List<Integer> listArray = Arrays.asList(array);
        System.out.println("Array: " + listArray);

        int min = listArray.get(0);
        for (int i = 1; i < listArray.size(); i++) {
            if (listArray.get(i) < min)
            {
                min = listArray.get(i);
            }
        }
        System.out.println("Min val in array: "+min+" is in index: "+listArray.indexOf(min));

        int max = listArray.get(0);
        for (int i = 1; i < listArray.size(); i++) {
            if (listArray.get(i) > max)
            {
                max = listArray.get(i);
            }
        }
        System.out.println("Max val in array: "+max+" is in index: "+listArray.indexOf(max));
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxSumSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(5);
        System.out.println("Array List: "+nums);
        System.out.print("Input k: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        ArrayList<Integer> arrResult = new ArrayList<>();
        int temp=0;
        for (int i = 0; i <= nums.size()-k; i++) {
            for (int j = 0; j < k; j++) {
                temp = temp + nums.get(i+j);
            }
            arrResult.add(temp);
            temp=0;
        }

        Integer maxVal = Collections.max(arrResult);
        System.out.print("Output: ");
        System.out.println(maxVal);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class PairWithTargetSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(11);
        System.out.println("Array List: "+numbers);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Target: ");
        int target = scanner.nextInt();

        ArrayList<Integer> arrResult = new ArrayList<>();
        int flag=0,flag2=0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j < numbers.size(); j++) {
                if (numbers.get(i)+numbers.get(j) == target)
                {
                    arrResult.add(i);
                    arrResult.add(j);
                }
            }
        }
        System.out.println(arrResult);
    }
}

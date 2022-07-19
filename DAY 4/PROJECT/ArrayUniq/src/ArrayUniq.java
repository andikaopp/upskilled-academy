import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUniq {
    public static void main(String[] args) {
        Integer[] number1 = {1,2,3,4};
        Integer[] number2 = {1,3,5,10,16};
        cekUniq(number1,number2);
    }

    static void cekUniq(Integer[] number1,Integer[] number2){
        int flag=0;
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(number1));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(number2));
        ArrayList<Integer> arrResult = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (!nums.get(i).equals(nums2.get(j))){
                    flag++;
                }
            }
            if(flag > nums.size())
                arrResult.add(nums.get(i));
            flag=0;
        }
        System.out.println("Number 1: "+nums);
        System.out.println("Number 2: "+nums2);
        System.out.println("Array Uniq: "+arrResult);
    }
}

import java.util.Arrays;

public class BinarySearch {
    public static boolean binarySearchOptimization(int[] array, int x, int start, int end){
        if (start > end) return false;

        int mid = start + ((end-start)/2);

        if (array[mid] > x) return true;
        else if (x < array[mid]) return binarySearchOptimization(array, x, start,mid-1);
        else return binarySearchOptimization(array, x, mid+1, end);
    }

    public static int findIndex(int arr[], int t)
    {

        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 3, 5, 5, 6, 7};
        boolean checkArray = binarySearchOptimization(array,6, 0, array.length - 1);
        if(checkArray) System.out.println(findIndex(array, 6));
        else System.out.println("Not Found");
    }
}

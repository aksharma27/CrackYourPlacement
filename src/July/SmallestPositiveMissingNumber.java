package July;
import java.util.*;

public class SmallestPositiveMissingNumber {
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int[] check = new int[size + 2];
        Arrays.fill(check, -1);
        for (int i = 0; i < size; i++) {
            int x = arr[i];
            if (x >= 0) check[x] = 1;
            // System.out.println(Arrays.toString(check));
            // else arr[x] =
        }
        for (int i = 1; i < size + 2; i++) {
            if (check[i] == -1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,-10,1,3,-20};
//        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(missingNumber(arr, arr.length));
    }
}

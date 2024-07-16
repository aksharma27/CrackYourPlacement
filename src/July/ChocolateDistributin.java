package July;

import java.util.Arrays;

public class ChocolateDistributin {
//    DAY - 2 :
//    find the min diff btw largest and the smallest element :
    public static void main(String[] args) {
        int[] chocolates = {7, 3, 2, 4, 9, 12, 56};
        int students = 3;
        System.out.println(findMin(students, chocolates));
    }

    static int findMin (int students, int[] choc) {
        Arrays.sort(choc);
        int n = choc.length;
        int i = 0, j = 1;
        int ans = Integer.MAX_VALUE;
        while (j < n) {
            if (j - i + 1 == students) {
                ans = (int) Math.min(ans, choc[j] - choc[i]);
                i++;
            }
            j++;
        }
        return ans;
    }
}

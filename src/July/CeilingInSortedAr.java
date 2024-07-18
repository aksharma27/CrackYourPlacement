package July;

public class CeilingInSortedAr {
    public static void main(String[] args) {
        int[] ar = {1,2, 8, 10, 10, 12, 19};
        System.out.println(findCeil(ar, 5));
    }

    static int findCeil (int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        int ceil = arr[0];
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > target) e = mid - 1;
            else if (arr[mid] < target) s = mid + 1;
        }
        return arr[s];
    }
}

package July;

public class FindPeakElement {
//    Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
//    You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
//    You must write an algorithm that runs in O(log n) time.

    public static void main(String[] args) {
            int arr[] = {1,2,3,1};
        System.out.println(findPeakIdx(arr));
    }

    static int findPeakIdx (int[] arr) {
        int n = arr.length;
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        int s = 1, e = n - 2;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
            else if (arr[mid] > arr[mid - 1]) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }
}

package July;

public class RemoveDuplicatesSortedArray {
//    DAY - 2
    static int removeDuplicates(int[] nums) {
        int l = 1;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != nums[r - 1]) {
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] ar = {1,1,2};
        System.out.println(removeDuplicates(ar));
    }
}

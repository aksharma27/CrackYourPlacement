package July;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
            int[] ar = {4,5,6,7,0,1,2};
        System.out.println(search(ar, 0));
    }

    static  int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] >= nums[s]){
                if(nums[mid] >= target && nums[s] <= target) e = mid - 1;
                else s = mid + 1;
            }

            else{
                if(nums[mid] <= target && nums[e] >= target) s = mid + 1;
                else e = mid - 1;
            }
        }
        return -1;
    }

}

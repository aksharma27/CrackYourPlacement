package July;

import java.util.Arrays;
//DAY - 1
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr= {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZeroes(int[] nums) {
        int fast = 1;
        int slow = 0;
        if (nums.length == 1) return;
        while (fast < nums.length) {
            if (nums[slow] == 0 && nums[fast] != 0) {
                nums[slow] = nums[fast];
                nums[fast] = 0;
                slow++;
                fast++;
            }
            else if (nums[slow] == 0 && nums[fast] == 0) fast++;
            else {  //slow = non zero, fast = 0
                slow++;
                fast++;
            }
        }
    }
}

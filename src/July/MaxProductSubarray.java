package July;

public class MaxProductSubarray {
    static int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix=prefix*nums[i];
            suffix=suffix*nums[nums.length-i-1];
            maxi=Math.max(maxi,Math.max(prefix,suffix));
        }
        return maxi;

    }

    public static void main(String[] args) {
        int[] ar = {2,3,-2,4};
        System.out.println(maxProduct(ar));
    }

}

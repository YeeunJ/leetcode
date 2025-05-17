class Solution {
    public int singleNumber(int[] nums) {
        int prev = -40000;
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if(prev == -40000) {
                prev = nums[i];
            } else if(prev == nums[i]){
                prev = -40000;
            } else {
                return prev;
            }
        }

        return prev;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for(int n: nums){
            if(n > nums[k]) {
                k++;
                nums[k] = n;
            }
        }

        return k+1;
    }
}
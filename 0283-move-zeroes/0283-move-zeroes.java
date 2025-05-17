class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int p1=0, p2;

        while(p1<len && nums[p1]!=0) p1++;
        p2=p1+1;

        while (p1 < len && p2 < len) {
            if (nums[p2] == 0) p2++;
            else {
                nums[p1] = nums[p2];
                nums[p2] = 0;
                p1++;
                p2++;
            }
        }
    }
}
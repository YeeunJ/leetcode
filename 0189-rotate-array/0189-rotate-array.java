class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;

        while (len <= k) k -= len;

        if (k == 0) return;

        int[] result = new int[len];
        int temp = 0;

        for(int i=len-k; i<len; i++) { 
            result[temp] = nums[i];
            temp++;
        }

        for(int i=0; i<len-k; i++) { 
            result[temp] = nums[i];
            temp++;
        }

        for(int i=0; i<len; i++) { 
            nums[i] = result[i];
        }

    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i=len-1; i>=0; i--) {
            digits[i] += 1;
            if(digits[i] > 9) digits[i] = 0;
            else break;
        }

        if(digits[0] == 0) {
            digits = new int[len+1];
            digits[0] = 1;
        }

        return digits;
    }
}
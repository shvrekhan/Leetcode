class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int digit = 0;

        while (digit < nums.length && zero < nums.length) {
            if (nums[digit] != 0) {
                if (nums[zero] == 0) {
                    // Swap non-zero element with the first zero
                    nums[zero] = nums[digit];
                    nums[digit] = 0;
                }
                zero++;
            }
            digit++;
        }
    }
}

class Solution {

    public int maxSubArray(int[] nums) {
        int globalMax = Integer.MIN_VALUE;
        int localMax = 0;

        for (int index = 0; index < nums.length; index++) {
            localMax += nums[index];
            if (localMax > globalMax) {
                globalMax = localMax;
            }
            if (localMax < 0) {
                localMax = 0;
            }
        }
        return globalMax;
    }
}

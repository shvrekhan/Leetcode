class Solution {

    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long result = isPolygonPossible(nums);
        return result;
    }

    public static long isPolygonPossible(int[] nums) {
        long currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
        }
        for (int i = nums.length - 1; i >= 2; i--) {
            currentSum -= nums[i];
            if (currentSum > nums[i]) {
                return currentSum + nums[i];
            }
        }
        return -1;
    }
}

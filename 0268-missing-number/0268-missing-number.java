class Solution {

    public int missingNumber(int[] nums) {
        int result = 0;
        for (int index = 0; index < nums.length; index++) {
            result = result ^ (index+1) ^ nums[index];
        }
        return result;
    }
}

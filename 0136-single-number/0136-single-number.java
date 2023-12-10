class Solution {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int index = 0; index < nums.length; index++) {
            result^=nums[index];
        }
        return result;
    }
}

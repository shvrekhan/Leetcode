class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        
        int result = 0;
        
        for(int index =0 ;index<size;index++){
            result = result ^ index ^ nums[index];
        }
        result^=size;
        
        return result;
    }
}
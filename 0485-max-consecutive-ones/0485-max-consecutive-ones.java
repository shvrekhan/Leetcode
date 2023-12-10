class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int globalCount = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == 1) {
                currentCount++;
            } else {
                if(currentCount > globalCount){
                    globalCount = currentCount;
                    
                }
                currentCount = 0 ;
            }
        }
        if(currentCount>globalCount){
            globalCount = currentCount;
        }
        return globalCount;
    }
}

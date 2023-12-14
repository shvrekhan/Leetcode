class Solution {

    public int[] rearrangeArray(int[] nums) {
        int halfLength = nums.length / 2;
        ArrayList<Integer> positive = new ArrayList<Integer>(halfLength);
        ArrayList<Integer> negative = new ArrayList<Integer>(halfLength);

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] < 0) {
                negative.add(nums[index]);
            } else {
                positive.add(nums[index]);
            }
        }
        int itr = 0;
        for (int index = 0; index < halfLength; index++) {
            nums[itr++] = positive.get(index);
            nums[itr++] = negative.get(index);
        }
        return nums;
    }
}

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] res = { 0, 0 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int temp = target - nums[index];
            if (map.get(temp) != null) {
                res[0] = index;
                res[1] = map.get(temp);
                break;
            } else {
                map.put(nums[index], index);
            }
        }
        return res;
    }
}

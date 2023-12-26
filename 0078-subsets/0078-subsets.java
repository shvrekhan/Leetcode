class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int size = nums.length ;
        getSubsets(nums, size, 0, ans, temp);
        return ans;
    }

    public void getSubsets(int[] nums, int size, int index, List<List<Integer>> ans, List<Integer> temp) {
        if (index == size) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        getSubsets(nums, size, index + 1, ans, temp);
        temp.remove(temp.size() - 1);
        getSubsets(nums, size, index + 1, ans, temp);
    }
}

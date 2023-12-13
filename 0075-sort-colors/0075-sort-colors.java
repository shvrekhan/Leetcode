class Solution {

    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int index = 0; index < nums.length; index++) {
             if (nums[index] == 0) {
                zero++;
            } else if (nums[index] == 1) {
                one++;
            } else {
                two++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (index < zero) {
                nums[index] = 0;
            } else if (index < zero + one) {
                nums[index] = 1;
            } else if (index < zero + one + two) {
                nums[index] = 2;
            }
        }
    }
}

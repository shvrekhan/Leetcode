class Solution {

    public boolean isPowerOfTwo(int n) {
        int shift = 0;
        while (n >= (1 << shift)) {
            if ((1 << shift) == n) {
                return true;
            } else if ((1 << shift) > Integer.MAX_VALUE / 2) {
                return false;
            }
            shift++;
        }
        return false;
    }
}

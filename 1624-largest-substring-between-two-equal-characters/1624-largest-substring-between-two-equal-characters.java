class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int globalMax = Integer.MIN_VALUE;

        for (int start = 0; start < s.length() - 1; start++) {
            char startAlphabet = s.charAt(start);
            int currentMax = 0;
            for (int end = start + 1; end < s.length(); end++) {
                currentMax++;
                if (startAlphabet == s.charAt(end) && currentMax-1 > globalMax) {
                    globalMax = currentMax-1;
                }
            }
            currentMax = 0;
        }
        return globalMax<0 ? -1 : globalMax;
    }
}
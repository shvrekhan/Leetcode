class Solution {

    public String firstPalindrome(String[] words) {
        for (int index = 0; index < words.length; index++) {
            if (isPalidromeCheck(words[index])) {
                return words[index];
            }
        }
        return "";
    }

    public static boolean isPalidromeCheck(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

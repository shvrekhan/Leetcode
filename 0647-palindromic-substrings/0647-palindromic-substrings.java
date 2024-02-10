class Solution {

    public int countSubstrings(String s) {
        int numberPalindromicSubstring = s.length();

        for (int startIndex = 0; startIndex < s.length() - 1; startIndex++) {
            for (int endIndex = startIndex + 1; endIndex < s.length(); endIndex++) {
                String currentSubstring = s.substring(startIndex, endIndex + 1);
                if (checkIsPalindrome(currentSubstring)) {
                    numberPalindromicSubstring++;
                }
            }
        }

        return numberPalindromicSubstring;
    }

    public static boolean checkIsPalindrome(String subString) {
        int start = 0;
        int last = subString.length() - 1;

        while (start <= last) {
            if (subString.charAt(start) != subString.charAt(last)) {
                return false;
            }
            start++;
            last--;
        }

        return true;
    }
}

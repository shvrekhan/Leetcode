class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] anagram = new char[26];
        for (int index = 0; index < s.length(); index++) {
            int i = s.charAt(index) - 'a';
            int b = t.charAt(index) - 'a';
            anagram[i] += 1;
            anagram[b] -= 1;

            if (anagram[i] < 0 || anagram[b] < 0) {
                return false;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (anagram[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

class Solution {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int total = 0;
        int curr = s.length - 1;

        int totalChilds = g.length;
        int totalCookies = s.length;

        for (int index = totalChilds - 1; index >= 0; index--) {
            if (total < totalCookies && curr >= 0 && g[index] <= s[curr]) {
                ++total;
                --curr;
            }
        }
        return total;
    }
}

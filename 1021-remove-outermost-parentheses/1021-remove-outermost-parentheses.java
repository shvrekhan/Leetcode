class Solution {

    public String removeOuterParentheses(String s) {
        ArrayList<String> validParentheses = new ArrayList<String>();
        StringBuilder temp = new StringBuilder();
        int open = 0;
        int close = 0;

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == '(') {
                open += 1;
            } else {
                close += 1;
            }
            temp.append(s.charAt(index));
            if (temp.length() % 2 == 0 && (open == close)) {
                validParentheses.add(temp.toString());
                temp.setLength(0);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String validParenthesis : validParentheses) {
            result.append(validParenthesis, 1, validParenthesis.length() - 1);
        }
        return result.toString();
    }
}

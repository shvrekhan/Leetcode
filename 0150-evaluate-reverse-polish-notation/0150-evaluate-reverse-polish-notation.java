class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<Integer>();

        for (int index = 0; index < tokens.length; index++) {
            if (!tokens[index].equals("+") && !tokens[index].equals("-") && !tokens[index].equals("*") && !tokens[index].equals("/")) {
                stk.push(Integer.parseInt(tokens[index]));
            } else {
                int one = stk.pop();
                int two = stk.pop();
                int temp = 0;
                switch (tokens[index]) {
                    case "+":
                        temp = one + two;
                        break;
                    case "-":
                        temp = two - one;
                        break;
                    case "*":
                        temp = two * one;
                        break;
                    case "/":
                        temp = two / one;
                }
                stk.push(temp);
            }
        }

        return stk.pop();
    }
}

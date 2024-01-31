class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<Integer>();
        int[] result = new int[temperatures.length];

        for (int index = temperatures.length - 1; index >= 0; index--) {
            if (stk.isEmpty()) {
                result[index] = 0;
                stk.push(index);
            } else {
                if (temperatures[index] >= temperatures[stk.peek()]) {
                    while (!stk.isEmpty() && temperatures[index] >= temperatures[stk.peek()]) {
                        stk.pop();
                    }
                    if (stk.isEmpty()) {
                        stk.push(index);
                        result[index] = 0;
                    } else {
                        result[index] = stk.peek() - index;
                        stk.push(index);
                    }

                } else {
                    result[index] = stk.peek() - index;
                    stk.push(index);
                }
            }
        }
        
        return result;
    }
}
class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x < y) {
            // prioritize "ba" first if y > x
            return removePairs(s, 'b', 'a', y, x);
        } else {
            // prioritize "ab" first if x >= y
            return removePairs(s, 'a', 'b', x, y);
        }
    }

    private int removePairs(String s, char first, char second, int firstVal, int secondVal) {
        int total = 0;
        StringBuilder remaining = new StringBuilder();

        // First pass: remove higher value pair
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                stack.pop();
                total += firstVal;
            } else {
                stack.push(c);
            }
        }

        // Build remaining string in correct order
        while (!stack.isEmpty()) {
            remaining.append(stack.pollLast());
        }

        // Second pass: remove lower value pair
        stack.clear();
        for (char c : remaining.toString().toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == second && c == first) {
                stack.pop();
                total += secondVal;
            } else {
                stack.push(c);
            }
        }

        return total;
    }
}

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Deque<Character> stack = new ArrayDeque<>();
        HashSet<Character> open = new HashSet<>(Set.of('(', '[', '{'));
        HashSet<Character> closed = new HashSet<>(Set.of(')', ']', '}'));
        for (char ch:s.toCharArray()) {
            if (open.contains(ch)) {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            } else if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty();    
    }
}
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            else {
                if(!stack.isEmpty()) {
                    char c = stack.pop();
                    if((c=='(' && s.charAt(i) == ')') || (c=='[' && s.charAt(i) == ']') || 
                       (c=='{' && s.charAt(i) == '}')) continue;
                }
                return false;
            }
        }
        return stack.isEmpty();
    }
}
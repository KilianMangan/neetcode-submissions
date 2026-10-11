class Solution {
    public boolean isValid(String list) {
        // use stack to push each bracket on and then pop when a closing bracket comes next. If there is no match then return false
        // Create a new stack
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < list.length(); i++) {
            char c = list.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;   // closer with nothing to match
                char open = stack.pop();
                if ((c == ')' && open != '(') ||
                    (c == ']' && open != '[') ||
                    (c == '}' && open != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();   // leftover openers mean invalid

    }
}

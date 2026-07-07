class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 !=0)
            return false;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char c : s.toCharArray()){
            if (!stack.isEmpty() && map.containsKey(c)) {
                if (stack.peek() == map.get(c))
                    stack.pop();
                else return false;
            }
            else 
                stack.push(c);
        }

        return stack.isEmpty();
    }
}

class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 !=0)
            return false;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(char c : s.toCharArray()){
            System.out.println("c : " + c);
            if(!stack.isEmpty() && map.containsKey(c)){
                System.out.println("stack peek : " + stack.peek());
                if(stack.peek() == map.get(c)){
                    System.out.println("stack pop : " + stack.peek());
                    stack.pop();
                }
                else return false;
            }
            else {
                System.out.println("stack push : " + c);
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}

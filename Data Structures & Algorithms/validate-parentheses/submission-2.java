class Solution {
    public boolean isValid(String s) {

        if(s.length() == 0 || s.length() == 1) return false;
        char initial = s.charAt(0);
        if(initial == ')' || initial == '}' || initial == ']'){
            return false;
        }
        else if(s.length() == 0) return false;

        Stack<Character> container = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || 
            s.charAt(i) == '['){
                container.push(s.charAt(i));
                continue;
            }
            if(container.empty()) return false;
            char c = container.pop();
            if(c == '[' && s.charAt(i) != ']') return false;
            else if(c == '{' && s.charAt(i) != '}') return false;
            else if(c == '(' && s.charAt(i) != ')') return false;
        }
        if(!container.empty()) return false;
        return true;
    }
}

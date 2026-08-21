class Solution {
    public boolean isValid(String s) {
        if(s == null || (s.length() & 1) == 1) return false;
        char[] stack = new char[s.length()];
        int top = -1;
        for(char c: s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack[++top] = c;
            }
            else if(top == -1) return false;
            else{
                char o = stack[top--];
                if(o == '(' && c != ')') return false;
                if(o == '[' && c != ']') return false;
                if(o == '{' && c != '}') return false;
            }
        }
        return top == -1;
    }
}

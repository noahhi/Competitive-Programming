class Solution {
    public boolean isValid(String s) {
        ArrayDeque stack = new ArrayDeque(); 
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ']' || ch == '}' || ch == ')'){
                if(stack.size() == 0){return false;}
                char last = (char) stack.pop();
                if(ch == ']' && last != '['){return false;}
                if(ch == '}' && last != '{'){return false;}
                if(ch == ')' && last != '('){return false;}
            } else {
                stack.push(ch);
            }
        }
        if(stack.size() != 0){
            return false;
        }
        return true;
    }
}

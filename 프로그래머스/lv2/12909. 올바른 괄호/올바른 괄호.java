import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                if(stack.size()==0){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.size()==0){
            return true;
        }

        return false;
    }
}
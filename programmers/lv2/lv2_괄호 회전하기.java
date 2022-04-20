import java.util.*;

class Solution {
    public int solution(String s) {
        int cnt = 0;
                
        for(int i=0; i<s.length(); i++) {
        	    if(checkRight(s))
        		cnt++;
        	    s = changeS(s);
        }
        return cnt;
    }

//  괄호가 올바른지 확인하는 메서드
    public static boolean checkRight(String s){
        Stack stack = new Stack<>();
        
        stack.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(!stack.isEmpty() && (ch==')' || ch=='}' || ch==']')) {
                if(ch==')' && stack.peek()==(Character)'(')
                    stack.pop();
                else if(ch=='}' && stack.peek()==(Character)'{')
                    stack.pop();
                else if(ch==']' && stack.peek()==(Character)'[')
                    stack.pop();
                else
                    return false;
            }else if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
        }

        if(!stack.isEmpty())
            return false;
        
        return true;
    }

//  왼쪽으로 회전시키는 메서드
    public static String changeS(String s) {
        char first = s.charAt(0);
        String newS = "";
    	
        for(int i=1; i<s.length(); i++) {
            newS += s.charAt(i);
    	}
    	newS += first;
    	
    	return newS; 
    }
}
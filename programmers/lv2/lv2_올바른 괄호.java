class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int sum = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(0)==')'){
                return false;
            }
            if(s.charAt(s.length()-1)=='('){
                return false;
            }
            
            if(s.charAt(i)=='('){
                sum++;
            }else if(s.charAt(i)==')'){
                sum--;
            }
            
            if(i!=s.length()-1 && sum==0){
                if(s.charAt(i+1)==')'){
                    return false;
                }
            }
        }
        if(sum!=0){
            return false;
        }

        return answer;
    }
}
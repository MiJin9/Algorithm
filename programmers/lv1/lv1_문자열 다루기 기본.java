class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!((s.length()==4 || s.length()==6) && '0'<=ch && ch<='9')){
                answer = false;
            }
        }
        return answer;
    }
}
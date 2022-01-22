class Solution {
    public String solution(String s) {
        String answer = (s.charAt(0)+"").toUpperCase();
        int cnt = 0;
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1)==' '){
                answer += (s.charAt(i)+"").toUpperCase();
                cnt = 0;
            }else{
                answer += (s.charAt(i)+"").toLowerCase();
            }
        }
        return answer;
    }
}
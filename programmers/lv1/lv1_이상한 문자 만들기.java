class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 1;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                cnt = 0;
                answer += " ";
            }else if((cnt%2==1)&&('a'<=ch && ch<='z')){
                answer += (ch+"").toUpperCase();
            }else if((cnt%2==0)&&('A'<=ch && ch<='Z')){
                answer += (ch+"").toLowerCase();
            }else{
                answer += ch;
            }
            cnt++;
        }
        return answer;
    }
}
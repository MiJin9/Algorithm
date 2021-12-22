class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            //대문자일때
            if('A'<=ch&&ch<='Z'){
                if('Z'<ch+n){
                    answer += (char)(ch + n - 26);
                    continue;
                }
                answer += (char)(ch + n);
                
            //소문자일때
            } else if('a'<=ch&&ch<='z'){
                if('z'<ch+n){
                   answer += (char)(ch + n - 26);
                    continue;
                }
                answer += (char)(ch + n);
                
            //공백일때
            } else if(ch==' '){
                answer += ' ';
            }
            
        }
        return answer;
    }
}
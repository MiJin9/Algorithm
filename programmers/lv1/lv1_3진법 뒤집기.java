class Solution {
    public int solution(int n) {
        int answer = 0;
        String sum = "";
        int cnt = 0;
        
        while(n>0){
            sum = sum + (n%3+"");
            n /= 3;
        }
        
        for(int i=sum.length()-1; i>=0; i--){
            answer += (sum.charAt(i)-'0')*Math.pow(3, cnt++);
        }
        
        
        return answer;
    }
}
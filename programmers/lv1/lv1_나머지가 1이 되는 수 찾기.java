class Solution {
    public int solution(int n) {
        int answer = n, rest = 0;
        
        for(int i=1; i<n; i++){
            answer = n / i;
            rest = n % i;
            
            if(rest == 1){
                return i;
            }
        }
        return answer;
    }
}
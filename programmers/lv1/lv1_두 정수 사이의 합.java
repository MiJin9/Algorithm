class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int min = a-b<0 ? a : b;
        int max = a-b<0 ? b : a;
        
        for(int i=min; i<=max; i++){
            answer += i;
        }
        
        return answer;
    }
}
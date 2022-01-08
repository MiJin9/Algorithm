class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        for(int i=Math.min(n,m); i>=1; i--){
            if(m%i==0 && n%i==0){
                answer[0] = i;
                break;
            }
        }
        answer[1] = n*m / answer[0];
        
        return answer;
    }
}
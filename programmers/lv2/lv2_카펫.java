class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int count = brown + yellow;
        
        for(int i=3; i<=count/2; i++){
            int w = 0, l = 0;
            
            if(count%i==0){
                w = count/i;
                l = i;
            }
            
            if((w*2+l*2-4)==brown){
                answer[0]=w;
                answer[1]=l;
                return answer;
            }
        }
        return answer;
    }
}
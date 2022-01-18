class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt = 0;

        while(s.length()>1){
            long oneCnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                oneCnt++;
            }
        }
            zeroCnt += s.length()-oneCnt;
            s = Long.toBinaryString(oneCnt);
            cnt++;
        }
               
        answer[0] = cnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
}
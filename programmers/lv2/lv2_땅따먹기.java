class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dp = new int[land.length][4];
        
        //배열의 첫번째 줄의 값 넣기
        dp[0][0] = land[0][0];
        dp[0][1] = land[0][1];
        dp[0][2] = land[0][2];
        dp[0][3] = land[0][3];
        
        //경우의 수 고려
        for(int i=1; i<land.length; i++){
            for(int j=0; j<4; j++){
                int max = 0;
                for(int k=0; k<4; k++){
                    if(j!=k)
                        max = Math.max(land[i][j]+dp[i-1][k], max);
                }
                dp[i][j] = max;
            }
        }
        
        //맨 마지막 줄의 최대값 구하기
        for(int i=0; i<4; i++){
            answer = Math.max(answer, dp[land.length-1][i]);
        }
        return answer;
    }
}
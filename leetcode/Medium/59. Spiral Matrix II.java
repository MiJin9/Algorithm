class Solution {
    public int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        
        for(int i=0; i<(n+1)/2; i++){
            for(int j=i; j<n-i; j++){
                answer[i][j] = num++;
            }
            for(int j=i+1; j<n-i; j++){
                answer[j][n-i-1] = num++;
            }
            for(int j=i+1; j<n-i; j++){
                answer[n-i-1][n-j-1] = num++;
            }
            for(int j=i+1; j<n-i-1; j++){
                answer[n-j-1][i] = num++;
            }
        }
        return answer;
    }
}
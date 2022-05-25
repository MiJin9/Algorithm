class Solution {
    static int n,m;
    
    public int[] findDiagonalOrder(int[][] mat) {
         if (mat == null || mat.length == 0) {
            return new int[0];
        }
        
        n = mat.length;
        m = mat[0].length;
        int[] answer = new int[n*m];
        int dir = 0, i = 0, j = 0, k = 0;
                
        while(i<n && j<m){
            answer[k++] = mat[i][j];
            int ni = i + (dir==0 ? -1 : 1);
            int nj = j + (dir==0 ? 1 : -1);
            
            if(notInRange(ni, nj)){
                if(dir==0){
                    i = i + (j==m-1 ? 1 : 0);
                    j = j + (j<m-1 ? 1 : 0);
                }else{
                    j = j + (i==n-1 ? 1 : 0);
                    i = i + (i<n-1 ? 1 : 0);
                }
                dir = (dir+1)%2;
            }else{
                i = ni;
                j = nj;
            }
        }
        return answer;
    }
    public static boolean notInRange(int x, int y){
        return x < 0 || x == n || y < 0 || y == m;
    }
}

class Solution {
    public int maximalSquare(char[][] matrix) {
        int k = 0, max = 0;
        int col = matrix.length;
        int row = matrix[0].length;
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                k = 0;
                boolean check = false;
                if(matrix[i][j]=='1'){
                    while(true){
                        k++;
                        for(int m=i; m<=i+k; m++){
                            for(int n=j; n<=j+k; n++){
                                if(!checkEnd(m,n,row,col) || matrix[m][n]=='0'){
                                    check = true;
                                    break;
                                }
                            }
                        }
                        if(check)
                            break;
                    }
                    max = Math.max(max, k);
                }
                if(max==col || max==row)
                    return max*max;
            }
        }
        return max*max;
    }
    public static boolean checkEnd(int x, int y, int row, int col){
        return 0<=x && x<col && 0<=y && y<row;
    }
}
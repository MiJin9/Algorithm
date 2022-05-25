class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] answer = new int[r][c];
        if(mat.length*mat[0].length!=r*c)
            return mat;
        
        int k=0, l=0;
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                answer[k][l++] = mat[i][j];
                if(l==c){
                    k++;
                    l=0;
                }
                if(k==r)
                    break;
            }
        }
        return answer;
    }
}
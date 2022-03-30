class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = 0;
        
        for(int i=0; i<matrix.length; i++){
            if(i!=0 && target<matrix[i][0]){
                col=i-1;
                break;
            }
            else if(target==matrix[i][0])
                return true;
            else
                col=matrix.length-1;
        }
        
        for(int i=0; i<matrix[col].length; i++){
            if(matrix[col][i]==target){
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
		for (int j = i+1; j < matrix[i].length; j++) {
			int tmp = matrix[j][i];
			matrix[j][i] = matrix[i][j];
			matrix[i][j] = tmp;

		}
	}
		
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[i].length/2; j++) {
			int tmp = matrix[i][j];
			matrix[i][j] = matrix[i][matrix[i].length-1-j];
			matrix[i][matrix[i].length-1-j] = tmp;
				
		}
	}	
    }
}
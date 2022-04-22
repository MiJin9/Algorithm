import java.util.*;

class Solution {
    static ArrayList list;
    public int[] solution(int rows, int columns, int[][] queries) {
        int num = 1;
		int[][] arr = new int[rows][columns];
		int[] answer = new int[queries.length];
		for(int i=0; i<rows; i++) {
		    for(int j=0; j<columns; j++) {
		        arr[i][j] = num;
		        num++;
		    }
		}
		
		for(int i=0; i<queries.length; i++) {
		    int x1 = queries[i][0]-1;
		    int y1 = queries[i][1]-1;
		    int x2 = queries[i][2]-1;
		    int y2 = queries[i][3]-1;
		    int tmp1 = 0, tmp2 = arr[x1][y1];
			
		    list = new ArrayList<>();
			
		    for(int j=y1; j<y2; j++) {
			tmp1 = arr[x1][j+1];
			list.add(tmp1);
			arr[x1][j+1] = tmp2;
			tmp2 = tmp1;
		    }

		    for(int j=x1; j<x2; j++) {
			tmp1 = arr[j+1][y2];
			list.add(tmp1);
			arr[j+1][y2] = tmp2;
			tmp2 = tmp1;
		    }			
			
		    for(int j=y2; j>y1; j--) {
			tmp2 = arr[x2][j-1];
			list.add(tmp2);
			arr[x2][j-1] = tmp1;
			tmp1 = tmp2;
		    }

		    for(int j=x2-1; j>=x1; j--) {
			tmp2 = arr[j][y1];
			list.add(tmp2);
			arr[j][y1] = tmp1;
			tmp1 = tmp2;
		    }
		    Collections.sort(list);
		    answer[i] = (int)list.get(0);	
        }
        return answer;
    }
}
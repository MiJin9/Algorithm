import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        int[] arr = new int[10001];
        ArrayList list = new ArrayList<>();
        int start = 0;
        int end = 0;
        
        for(int i=0; i<intervals.length; i++){
            if(intervals[i][0]==0 && intervals[i][1]==0){
                int[] addZero = new int[2];
                addZero[0] = 0;
                addZero[1] = 0;
                list.add(addZero);
            }
        }
                
        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<intervals[i][1]; j++){
                arr[j] = 1;
            }
            if(intervals[i][0] == intervals[i][1]){
                arr[intervals[i][0]] = 1;
            }
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==0 && arr[i+1]==1){
                start = i+1;
            }
            if(arr[i]==1 && arr[i+1]==0){
		        int[] startEnd = new int[2];
                end = i;
                startEnd[0] = start;
                startEnd[1] = end+1;
                list.add(startEnd);
            }
        }
        
        int[][] answer = new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<2; j++) {
            	answer[i] = (int[])list.get(i);
            }
        }
        return answer;
    }
}
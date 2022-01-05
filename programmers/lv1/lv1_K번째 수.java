import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<answer.length; i++){
            int[] temp = new int[commands[i][1]-commands[i][0]+1];
            
            System.arraycopy(array, commands[i][0]-1, temp, 0, temp.length);
            Arrays.sort(temp);
            int num = temp[commands[i][2]-1];
            answer[i] = num;
        }
        
        return answer;
    }
}
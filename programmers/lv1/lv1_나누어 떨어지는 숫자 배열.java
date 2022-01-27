import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] tmp = new int[arr.length];
        int count = 0, idx = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                tmp[i] = arr[i];
                count++;
            }
        }

        Arrays.sort(tmp);
        
        if(count == 0){
            int[] answer = new int[]{-1}; 
            return answer;
            
        }else{
            int[] answer = new int[count];
            for(int i=0; i<tmp.length; i++){
                if(tmp[i] == 0) 
                    continue;
                else
                    answer[idx++] = tmp[i];
            }
            return answer;
        }
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> numSet = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                numSet.add(numbers[i] + numbers[j]);
            }
        }
        
        Iterator iter = numSet.iterator();
        int[] answer = new int[numSet.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = (int)iter.next();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
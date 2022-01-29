import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] copy = new String[answer.length];
        
        for(int i=0; i<strings.length; i++){
            copy[i] = strings[i].charAt(n) + strings[i];
            answer[i] = "";
        }
        
        Arrays.sort(copy);
        
        for(int i=0; i<copy.length; i++){
            for(int j=1; j<copy[i].length(); j++){
                answer[i] += copy[i].charAt(j);
            }
        }
        return answer;
    }
}
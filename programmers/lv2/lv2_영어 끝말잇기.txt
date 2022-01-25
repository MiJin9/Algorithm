import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        String word = words[0];
        HashSet<String> set = new HashSet<>();
        boolean check = false;
		
	set.add(words[0]);
		
	for(int i=1; i<words.length; i++){
		answer[0] = i % n + 1;
		answer[1] = i / n + 1;
        		if(word.charAt(word.length()-1)!=words[i].charAt(0)){
                		check = true;
                		break;
            	}else {
            		if(!set.add(words[i])) {
                    	check = true;
            		break;
            	}else {
            		set.add(words[i]);
            	}
            	
            }
            word = words[i];
        }
        if(!check){
            answer[0] = 0;
            answer[1] = 0;
        }
        return answer;
    }
}
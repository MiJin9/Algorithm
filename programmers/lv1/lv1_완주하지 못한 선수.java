import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap map = new HashMap();
        int tmp = 0;
		Arrays.sort(participant);
		Arrays.sort(completion);
		
        //map에 참가자 집어넣음
	for (int i=0; i<participant.length; i++) {
		map.put(i, participant[i]);
	}
		
        for (int i=0; i<map.size(); i++) {
		boolean check = false;
        		//맨 마지막이 다른 경우
		if(i>=completion.length) {
			return (String)map.get(i);
		}
		if(map.get(i).equals(completion[i])) {
			check = true;
		}
            	//순서가 다른 경우
		if(!check) {
			return (String)map.get(i);
		}
	}
        
        return "";
    }
}
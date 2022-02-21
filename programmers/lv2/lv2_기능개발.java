import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //걸리는 날짜를 담을 배열
        int[] days = new int[progresses.length];
        ArrayList list = new ArrayList();
        
        //날짜를 계산해서 배열에 넣음
        for(int i=0; i<progresses.length; i++){
            int remainder = 100-progresses[i];
            while(remainder>0){
                remainder -= speeds[i];
                days[i]++;
            }
        }
        
        //배포날짜 계산
        int max = 0;
        int cnt = -1;
        int num = 1;
        for(int i=0; i<days.length; i++){
            if(days[i]>max){
            	num = 1;
                cnt++;
                list.add(num);
                max = days[i];
            }
            else {
            	list.remove(cnt);
            	list.add(++num);
            }
                
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = (int)list.get(i);
        }

        return answer;
    }
}
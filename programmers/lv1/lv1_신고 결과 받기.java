import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] reportCnt = new int[id_list.length];
        HashMap<String, HashSet<String>> map = new HashMap<>();
        
        //map에 <유저ID, 유저가 신고한 ID> 값 넣기
        for(int i=0; i<report.length; i++){
            String[] tmp = report[i].split(" ");
            if(map.containsKey(tmp[0])){
            	map.get(tmp[0]).add(tmp[1]);
            }else {
            	HashSet<String> set = new HashSet<>();
            	set.add(tmp[1]);
            	map.put(tmp[0], set);
            }
        }
        
        //신고횟수 세기
        for(int i=0; i<id_list.length; i++) {
            if(map.containsKey(id_list[i])) {
        	        for(int j=0; j<id_list.length; j++) {
        		    if(map.get(id_list[i]).contains(id_list[j])) {
        		        reportCnt[j]++;
        		    }
        	        }
            }
        }
        
        //메일 받는 횟수 세기
        for(int i=0; i<id_list.length; i++){
            if(reportCnt[i]>=k){
                for(int j=0; j<id_list.length; j++){
                    if(map.containsKey(id_list[j])){
                        if(map.get(id_list[j]).contains(id_list[i])) {
                            answer[j]++;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
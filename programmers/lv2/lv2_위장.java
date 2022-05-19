import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, ArrayList<String>> map = new HashMap();
        for(int i=0; i<clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                ArrayList<String> list = map.get(clothes[i][1]);
                list.add(clothes[i][0]);
                map.replace(clothes[i][1], list);
            }else{
                ArrayList<String> list = new ArrayList();
                list.add(clothes[i][0]);
                map.put(clothes[i][1], list);
            }
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
	        answer *= (map.get(entry.getKey()).size()+1);
        }
        return answer-1;
    }
}
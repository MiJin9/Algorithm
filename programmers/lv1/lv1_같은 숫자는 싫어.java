import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList list = new ArrayList();
	list.add(arr[0]);
		
	for(int i=1; i<arr.length; i++) {
		if(arr[i-1]!=arr[i])
			list.add(arr[i]);
	}
		
	Iterator it = list.iterator();
		
	int[] answer = new int[list.size()];
	int i=0;
		
	while(it.hasNext()) {
		answer[i] = (int) it.next();
		i++;
	}

        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {		
        int group = 0;
	int idx = people.length-1;
        Arrays.sort(people);
        		
	ArrayList<Integer> list = new ArrayList<>();
	for(int i=people.length-1; i>=0; i--) {
		list.add(people[i]);
	}

	for (int i = 0; i<people.length; i++) {
            if(idx<i)
		break;
	    if(list.get(i)<=limit/2) {
		group += (idx-i)/2;
		group++;
		break;
	    }
	    if (list.get(i) + list.get(idx) > limit) {
		group++;
	    }else {
		group++;
		idx--;
	    }
	}
        return group;
    }
}
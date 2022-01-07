import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++) {
        	if(answers[i] == a[i%5])
        		sum1++;
        	if(answers[i] == b[i%8])
        		sum2++;
        	if(answers[i] == c[i%10])
        		sum3++;
        }
        
        ArrayList list = new ArrayList();
        int max = Math.max(Math.max(sum1,sum2),sum3);
        int count = 0;
        
        if(max==sum1) {
        	list.add(1);
        }
        if(max==sum2) {
        	list.add(2);
        }
        if(max==sum3) {
        	list.add(3);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = Integer.parseInt(list.get(i)+"");
        }
        
        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countX = 0, countY = 0;
        
	        for(int i=0; i<s.length(); i++){
	            char ch = s.charAt(i);
	            if(ch == 'p' || ch == 'P'){
	                countX += 1;
	            } else if(ch == 'y' || ch == 'Y'){
	                countY += 1;
	            } else {continue;}
	        }
	        answer = (countX == countY ? true : false);
        

        return answer;
    }
}
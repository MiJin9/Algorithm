class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split(" ");
		int[] numArr = new int[strArr.length];
		
		for(int i=0; i<strArr.length; i++) {
			numArr[i] = Integer.parseInt(strArr[i]);
		}
        int max = numArr[0];
        int min = numArr[0];
        
        for(int i=0; i<numArr.length; i++){
            max = Math.max(numArr[i], max);
            min = Math.min(numArr[i], min);
        }
        
        answer = min + " " + max;
        return answer;
    }
}
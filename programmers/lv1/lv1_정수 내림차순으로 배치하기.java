class Solution {
    public long solution(long n) {
        String str = n + "";
        String answer = "";
        
        char[] arr = str.toCharArray();
        
        for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]<arr[j+1]) {
					char ch = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = ch;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
		}
        
        return Long.parseLong(answer);
    }
}
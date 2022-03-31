class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
	String[] arr1Str = new String[n];
	String[] arr2Str = new String[n];
	String[] answer = new String[n];
		
	for(int i=0; i<n; i++) {
		answer[i] = "";
	}
        
        for(int i=0; i<n; i++) {
		arr1Str[i] = Integer.toBinaryString(arr1[i]);
		while(arr1Str[i].length()!=n) {
			arr1Str[i] = "0" + arr1Str[i];
		}
	}
	for(int i=0; i<n; i++) {
		arr2Str[i] = Integer.toBinaryString(arr2[i]);
		while(arr2Str[i].length()!=n) {
			arr2Str[i] = "0" + arr2Str[i];
		}
	}
		
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			if(arr1Str[i].charAt(j)=='1' || arr2Str[i].charAt(j)=='1') {
				answer[i] += "#";
			}else {
				answer[i] += " ";
			}
		}
	}
        return answer;
    }
}
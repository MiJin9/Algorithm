class Solution {
    public int solution(String s) {
        String sum = "";
	String answer = "";
	String[] eng = {"zero","one","two","three","four",
		        "five","six","seven","eight","nine"};
		
	for(int i=0; i<s.length(); i++) {
		sum += s.charAt(i);
		for(int j=0; j<eng.length; j++) {
			if('0'<=s.charAt(i) && s.charAt(i)<='9'){
				answer += s.charAt(i);
				sum = "";
				break;
			}else if(sum.equals(eng[j])) {
				answer += j;
				sum = "";
			}
		}
	}
        return Integer.parseInt(answer);
    }
}
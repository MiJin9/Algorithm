class Solution {
    public static int changeNum(int n) {
		String num2 = "";
		int count = 0;
		
		num2 = Integer.toBinaryString(n);
		
		for(int i=0; i<num2.length(); i++) {
			if(num2.charAt(i)=='1') {
				count++;
			}
		}
		return count;
	}
    
    public int solution(int n) {
        int n2 = n+1;
        
        while(true) {
		if(changeNum(n)==changeNum(n2))
			break;
		else
			n2++;
		}
        
        return n2;
    }
}
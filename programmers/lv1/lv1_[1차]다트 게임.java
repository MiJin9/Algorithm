class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
	int idx = -1;
	int num = 0, sum = 0;

	for(int i=0; i<dartResult.length(); i++) {
		char ch = dartResult.charAt(i);
			
		if('0'<=ch && ch<='9') {
			if(i!=0 && dartResult.charAt(i-1)=='1')
				num = 10;
			else
				num = ch-'0';
		}
		if(ch=='*') {
			score[idx] *= 2;
			if(idx!=0)
				score[idx-1] *= 2;
		}else if(ch=='#') {
			score[idx] *= -1;
		}
		if(ch=='S') {
			score[++idx] = num;
		}else if(ch=='D') {
			score[++idx] = num*num;
		}else if(ch=='T') {
			score[++idx] = num*num*num;
		}
	}
	for(int i=0; i<3; i++) {
		sum += score[i];
	}
        return sum;
    }
}
class Solution {
    public int[] solution(int N, int[] stages) {
        float[] fail = new float[N+2];
	int passCnt = 0;
		
	//도달했으나 클리어하지 못한 인원수
	for(int i=0; i<stages.length; i++) {
		fail[stages[i]]++;
	}
	for(int i=1; i<N+1; i++) {
		passCnt=0;
		//이미 통과한 인원수 
		for(int j=0; j<stages.length; j++) {
			if(stages[j]>=i) {
				passCnt++;
			}
		}
		//실패율 계산
		if(fail[i]==0)
			continue;
		else
			fail[i] = fail[i]/passCnt;
	}
		
	int[] answer = new int[N];
		
	for(int i=1; i<fail.length-1; i++) {
		float max = -1f;
		int maxIdx = 0;
		for(int j=1; j<fail.length-1; j++) {
			if(fail[j]>max) {
				max = fail[j];
				maxIdx = j;
			}
		}
		fail[maxIdx] = -1;
		answer[i-1] = maxIdx;
	}
        return answer;
    }
}
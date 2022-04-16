class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
		String temp = "";
		int[][] place = {{1,0},{0,3},{1,3},{2,3},{0,2},{1,2},{2,2},{0,1},{1,1},{2,1}};
		int lx=0, ly=0, rx=2, ry=0;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
				answer += "L";
				temp = "L";
			}else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
				answer += "R";
				temp = "R";
			}else {
                			//손가락 위치, 입력할 숫자 거리 구하기
				double first = Math.ceil((float)Math.sqrt(Math.pow(rx-place[numbers[i]][0],2) + Math.pow(ry-place[numbers[i]][1],2)));
				double second = Math.ceil((float)Math.sqrt(Math.pow(lx-place[numbers[i]][0],2) + Math.pow(ly-place[numbers[i]][1],2)));
				
				if(first<second || (hand.equals("right") && first==second)) {
					answer += "R";
					temp = "R";
				}else{
					answer += "L";
					temp = "L";
				}
			}
            		//손가락 위치
			if(temp=="R") {
				rx = place[numbers[i]][0];
				ry = place[numbers[i]][1];
			}else {
				lx = place[numbers[i]][0];
				ly = place[numbers[i]][1];				
			}
		}
        return answer;
    }
}
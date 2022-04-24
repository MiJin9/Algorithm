class Solution {
    public int solution(String skill, String[] skill_trees) {
        int[][] skillIdx = new int[skill_trees.length][skill.length()];
	int answer = skill_trees.length;
		
	for(int i=0; i<skillIdx.length; i++)
	    for(int j=0; j<skillIdx[i].length; j++)
	        skillIdx[i][j] = 27;		
		
	for(int i=0; i<skill.length(); i++) {
	    char ch = skill.charAt(i);
	    for(int j=0; j<skill_trees.length; j++) {
		for(int k=0; k<skill_trees[j].length(); k++) {
		    if(ch==skill_trees[j].charAt(k))
			skillIdx[j][i] = k;
	        }
	    }
	}
		
	for(int i=0; i<skillIdx.length; i++) {
	    for(int j=0; j<skillIdx[i].length-1; j++) {
	        if(skillIdx[i][j+1]<skillIdx[i][j]) {
		    answer--;
		    break;
		}
	    }
	}
        return answer;
    }
}
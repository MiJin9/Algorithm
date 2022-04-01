import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
	int result = 0;
		
	for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++) {
            	if(board[j][moves[i]-1]!=0) {
            		if(!stack.isEmpty() && stack.peek()==board[j][moves[i]-1]) {
            			stack.pop();
            			result += 2;
            		}else {
            		stack.add(board[j][moves[i]-1]);
            		}
            		board[j][moves[i]-1]=0;
            		break;
            	}
            }
        }
        return result;
    }
}
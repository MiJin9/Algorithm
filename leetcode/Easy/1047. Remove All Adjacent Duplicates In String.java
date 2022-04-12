class Solution {
    public String removeDuplicates(String s) {
        Stack stack = new Stack();
        String answer = "";
		
	stack.add(s.charAt(0));
	for(int i=1; i<s.length(); i++) {
		if(!stack.isEmpty() && (char)stack.peek()==s.charAt(i)) {
			stack.pop();
		}else {
			stack.add(s.charAt(i));
		}
	}
        while(!stack.isEmpty()) {
		answer = stack.pop() + answer;
	}
        return answer;
    }
}
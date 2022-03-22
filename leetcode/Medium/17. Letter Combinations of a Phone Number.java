class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<String>();
	if(digits.isEmpty()) return list;
		
		String[] buttons = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
	list.add("");
	while(list.peek().length()!=digits.length()){
		String remove = list.remove();
		String map = buttons[digits.charAt(remove.length())-'0'];
		for(char c: map.toCharArray()){
			list.addLast(remove+c);
		}
	}
        return list;
    }
}
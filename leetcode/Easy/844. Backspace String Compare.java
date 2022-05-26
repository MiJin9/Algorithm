class Solution {
    public boolean backspaceCompare(String s, String t) {
        return fuc(s).equals(fuc(t));
    }
    public static String fuc(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
        	if('a'<=str.charAt(i) && str.charAt(i)<='z')
                stack.add(str.charAt(i));
        	else if(str.charAt(i)=='#' && stack.size()!=0)
        		stack.pop();
        }
        return String.valueOf(stack);
    }
}
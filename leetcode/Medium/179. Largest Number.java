class Solution {
    public String largestNumber(int[] nums) {
        String answer = "";
        String[] numStr = new String[nums.length];
        
        for(int i=0; i<nums.length; i++)
            numStr[i] = nums[i]+"";
            
            Arrays.sort(numStr, new Comparator<String>(){
                @Override
                public int compare(String s1, String s2){
                    String one = s1 + s2;
                    String two = s2 + s1;
                    return two.compareTo(one);
                }
            });
        
        if(numStr[0].charAt(0) == '0')
	    return "0";

        for(int i=0; i<numStr.length; i++)
            answer += numStr[i];
        
        return answer;
    }
}

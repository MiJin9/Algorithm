class Solution {
    public String solution(String new_id) {
        String temp = "";
		
	//1단계
	new_id = new_id.toLowerCase();
		
	//2단계
	for(int i=0; i<new_id.length(); i++) {
		char ch = new_id.charAt(i);
		if('a'<=ch&&ch<='z' || '0'<=ch&& ch<='9' || ch=='-' || ch=='_' || ch=='.') {
			temp += ch;
		}
	}
	new_id = temp;
	temp = "";
		
	//3,4단계 
	for(int i=0; i<new_id.length(); i++) {
		if(i!=0 && new_id.charAt(i-1)=='.' && new_id.charAt(i)=='.') {
			continue;
		}else if((i==0 || i==new_id.length()-1) && new_id.charAt(i)=='.'){
			continue;
		}else {
			temp += new_id.charAt(i);
		}
	}
        if(temp.length()>=2 && temp.charAt(temp.length()-1)=='.')
		temp = temp.substring(0,temp.length()-1);
	new_id = temp;
	temp = "";
		
	//5,6,7단계 
	if(new_id.length()==0)
		new_id="aaa";
	else if(new_id.length()==1)
		new_id = new_id + new_id.charAt(0) + new_id.charAt(0);
	else if(new_id.length()==2)
		new_id += new_id.charAt(1);
	else if(new_id.length()>=16)
		new_id = new_id.substring(0,15);
        
        if(new_id.charAt(new_id.length()-1)=='.')
            new_id = new_id.substring(0,14);

        return new_id;
    }
}
import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        
	for (int i = 0; i < s.length(); i++) {
         	String str = s.charAt(i)+"";
                //맨 앞문자는 넣기
		if(i==0|| stack.empty())
			stack.push(str);
                //중복 빼기
		else if (stack.peek().equals(str))
			stack.pop();
                //다르면 쌓기
		else
			stack.push(str);
			}

	}

	if (stack.empty())
            answer = 1;

        return answer;
    }
}
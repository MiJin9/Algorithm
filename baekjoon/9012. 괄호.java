import java.util.*;

class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String str = sc.next();
            boolean check = false;
            Stack<Character> s = new Stack();
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                if(ch=='(') {
                    s.add(ch);
                }else {
                    if(!s.isEmpty()) {
                	s.pop();
                    }else {
                	check = true;
                	break;
                    }
                }
            }
            if(!s.isEmpty() || check==true)
            	System.out.println("NO");
            else
            	System.out.println("YES");
            
        }
    }
}
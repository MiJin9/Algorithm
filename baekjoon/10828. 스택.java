import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
	Stack<Integer> stack = new Stack();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	StringTokenizer st;
	int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
            String str = br.readLine();
            
            if(str.equals("pop")){
                if(stack.size()>0)
                    System.out.println(stack.pop());
                else
                    System.out.println(-1);
            }else if(str.equals("size")){
                System.out.println(stack.size());
            }else if(str.equals("empty")){
                if(stack.isEmpty())
                    System.out.println("1");
                else
                    System.out.println("0");
            }else if(str.equals("top")){
                if(stack.size()>0)
                    System.out.println(stack.peek());
                else
                    System.out.println(-1);
            }else{
                String[] arr = str.split(" ");
                int num = Integer.parseInt(arr[1]);
                stack.push(num);
            }
        }
    }
}
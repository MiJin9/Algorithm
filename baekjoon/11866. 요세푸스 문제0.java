import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList();
        int cnt = 0;
        for(int i=1; i<=n; i++)
            q.add(i);
        
        System.out.print("<");
        while(q.size()>1) {
            int num = q.poll();
            cnt++;
            if(cnt!=k) {
        	q.add(num);        		
            }else {
        	System.out.print(num + ", ");
        	cnt=0;
            }
        }
        System.out.println(q.poll() + ">");
    }
}
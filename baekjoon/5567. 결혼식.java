import java.util.*;

class Main{
	static LinkedList<Integer>[] list;
	static int[] visited;
	static int answer;
	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        list = new LinkedList[n+1];
        visited = new int[n+1];
        
        for(int i=1; i<=n; i++)
            list[i] = new LinkedList<Integer>();
        
        for(int i=0; i<m; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            list[n1].add(n2);
            list[n2].add(n1);
        }
        
        bfs();
        System.out.println(answer);
        
    }
    static void bfs(){
    	Queue<Integer> q = new LinkedList();
        q.add(1);
        visited[1]++;
        
        while(!q.isEmpty()) {
            int n = q.poll();
            if(visited[n]>=3)
        	break;
        	
            for(int next : list[n]) {
        	if(visited[next]==0) {
        	    visited[next] = visited[n] + 1;
        	    answer++;
        	    q.add(next);
        	}
            }
        }
    }
}
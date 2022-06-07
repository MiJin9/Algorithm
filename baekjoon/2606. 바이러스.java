import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {    
    static LinkedList<Integer>[] list;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        list = new LinkedList[n+1];
        visited = new boolean[n+1];
        int cnt = 0;
		
        for(int i=1; i<=n; i++) { 
        list[i] = new LinkedList<Integer>(); 
        } 
        for(int i=0; i<m; i++) { 
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            int n1 = Integer.parseInt(st.nextToken()); 
            int n2 = Integer.parseInt(st.nextToken());
            list[n1].add(n2); 
            list[n2].add(n1); 
        }
        dfs(1);
        for(int i=1; i<=n; i++)
            if(visited[i])
                cnt++;
        
        System.out.println(cnt-1);
    }
    static void dfs(int vertex) {
        for(int i=0; i<list[vertex].size(); i++) {
    	    int cur_v = list[vertex].get(i);
    	    if(!visited[cur_v]) {
                visited[cur_v] = true;
                dfs(cur_v);
            }
    	}
    }
}
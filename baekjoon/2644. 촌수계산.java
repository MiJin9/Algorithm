import java.util.*;

class Main{
    static Queue<Integer> q;
    static LinkedList<Integer>[] list;
    static boolean[] visited;
    static int[] cnt;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int m = sc.nextInt();
        q = new LinkedList<>();
        
        visited = new boolean[n+1];
        cnt = new int[n+1];
        list = new LinkedList[n+1];
        for(int i=1; i<=n; i++){
            list[i] = new LinkedList<Integer>();
        }
        for(int i=0; i<m; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            list[num1].add(num2);
            list[num2].add(num1);
        }
        for(int i=0; i<=n; i++)
        	cnt[i] = -1;
        
        q.add(p1);
        visited[p1] = true;
        cnt[p1] = 0;
        bfs();
        System.out.println(cnt[p2]);
    }
    static void bfs(){
        while(!q.isEmpty()){
            int x = q.peek();
            q.poll();
            
            for(int i=0; i<list[x].size(); i++){
                int next = list[x].get(i);
                if(!visited[next]){
                    visited[next] = true;
                    q.add(list[x].get(i));
                    cnt[list[x].get(i)] = cnt[x] + 1;
                }
            }
        }
    }
}
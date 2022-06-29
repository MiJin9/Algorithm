import java.util.*;

class Solution {
    static LinkedList<Integer>[] list;
    static boolean[] visited;
    static int[] cnt;
    
    public int solution(int n, int[][] edge) {
        int answer = 1;
        list = new LinkedList[n+1];
        visited = new boolean[n+1];
        cnt = new int[n+1];
        for(int i=1; i<=n; i++)
            list[i] = new LinkedList<Integer>();
        
        for(int i=0; i<edge.length; i++){
            list[edge[i][0]].add(edge[i][1]);
            list[edge[i][1]].add(edge[i][0]);
        }

        visited[1] = true;
        bfs(1);
        
        //cnt 배열 정렬 후, 최대값의 갯수 구하기
        Arrays.sort(cnt);
        for(int i=1; i<n; i++){
            if(cnt[i]==cnt[n])
                answer++;
        }
        
        return answer;
    }
    static void bfs(int node){
        Queue<Integer> q = new LinkedList();
        q.add(node);
        visited[node] = true;
        
        while(!q.isEmpty()){
            int num = q.poll();
            for(int i=0; i<list[num].size(); i++){
                int next = list[num].get(i);
                if(!visited[next]){
                    q.add(next);
                    visited[next] = true;
                    cnt[next] = cnt[num] + 1;
                }
            }
        }
        
    }
}
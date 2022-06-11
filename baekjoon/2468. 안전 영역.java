import java.util.*;

class Main{
    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static ArrayList<Integer> list;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        visited = new boolean[n][n];
        int maxNum = 0;
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
                maxNum = Math.max(arr[i][j], maxNum);
            }
        
        list = new ArrayList<>();
        
        for(int idx=0; idx<=maxNum; idx++) {
	    int cnt = 0;
        	    reloadVisited();
        	    for(int i=0; i<n; i++){
        		for(int j=0; j<n; j++){
        		    if(canGo(i,j,idx)){
        		        visited[i][j] = true;
        			cnt++;
        			dfs(i,j,idx);
        		    } 
        		} 
        	    } 
        	    list.add(cnt);
        }
        int max = Collections.max(list);
        System.out.println(max);
    }
    static void dfs(int x, int y, int k){
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(canGo(nx,ny,k)){
                visited[nx][ny] = true;
                dfs(nx,ny,k);
            }
        }
    }
    static void reloadVisited() {
    	for(int i=0; i<n; i++)
    	    for(int j=0; j<n; j++)
    	        visited[i][j] = false;
    }
    static boolean canGo(int x, int y, int k){
        return inRange(x,y) && !visited[x][y] && arr[x][y]>k;
    }
    static boolean inRange(int x, int y){
        return 0<=x && x<n && 0<=y && y<n;
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {    
    static int n,m,cnt;
    static int[][] arr;
    static boolean[][] visited;
    static Queue<Pos> q;
    
    static class Pos{
        int r,c;
        public Pos(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	n = Integer.parseInt(st.nextToken());
	m = Integer.parseInt(st.nextToken());
		
	arr = new int[n][m];
	for(int i=0; i<n; i++) {
		String s = br.readLine();
		for(int j=0; j<m; j++) {
			arr[i][j] = s.charAt(j) - '0';
		}
	}
        visited = new boolean[n+1][m+1];
        q = new LinkedList();
        q.add(new Pos(0,0));
	visited[0][0] = true;
	bfs();
        
        System.out.println(arr[n-1][m-1]);
    }
    static void bfs(){
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        while(!q.isEmpty()){
            int x = q.peek().r;
            int y = q.peek().c;
            q.poll();
            
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(canGo(nx,ny)){
                    visited[nx][ny] = true;
                    arr[nx][ny] = arr[x][y] + 1;
                    q.add(new Pos(nx,ny));
                }
            }
        }
    }
    static boolean canGo(int x, int y){
        if(!inRange(x,y) || visited[x][y] || arr[x][y]==0)
            return false;
        
        return true;
    }
    static boolean inRange(int x, int y){
        return 0<=x && x<n && 0<=y && y<m;
    }
}
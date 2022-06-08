import java.util.*;

class Main {    
    static int n,houseCnt;    
    static boolean[][] visited;
    static int[][] arr;
    static ArrayList<Integer> list;
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n][n];
        arr = new int[n][n];
        list = new ArrayList();        
		
        for(int i=0; i<n; i++) {
            String str = sc.next();
            for(int j=0; j<n; j++){
                arr[i][j] = (str.charAt(j)-'0');
            }            
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                if(canGo(i,j)){
                    visited[i][j] = true;
                    houseCnt = 1;
                    dfs(i,j);
                    list.add(houseCnt);
                }
            }            
        }
        System.out.println(list.size());
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    static void dfs(int x, int y){
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(canGo(nx,ny)){
                visited[nx][ny] = true;
                houseCnt++;
                dfs(nx,ny);
            }
        }
    }
    static boolean canGo(int x, int y){
        return inRange(x,y) && arr[x][y]==1 && !visited[x][y];
    }
    static boolean inRange(int x, int y){
        return 0<=x && x<n && 0<=y && y<n;
    }
}
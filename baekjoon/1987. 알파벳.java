import java.util.*;

class Main{
    static int r,c,max;
    static int[][] arr;
    static boolean[][] visited;
    static boolean[] alp;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        arr = new int[r][c];
        visited = new boolean[r][c];
        alp = new boolean[26];
        for(int i=0; i<r; i++){
            String str = sc.next();
            for(int j=0; j<c; j++){
                arr[i][j] = str.charAt(j) - 'A';
            }
        }
        alp[arr[0][0]] = true;
        dfs(0,0,1);

        System.out.println(max);        
    }
    static void dfs(int x, int y, int cnt){
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        
        alp[arr[x][y]] = true;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(canGo(nx,ny)){
                dfs(nx,ny,cnt+1);
            }
        }
        alp[arr[x][y]] = false;
        max = Math.max(max, cnt);            	
    }
    static boolean canGo(int x, int y){
        return inRange(x,y) && alp[arr[x][y]]==false;
    }
    static boolean inRange(int x, int y){
        return 0<=x && x<r && 0<=y && y<c;
    }
}
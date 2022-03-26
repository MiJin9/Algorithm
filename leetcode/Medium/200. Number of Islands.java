class Solution {
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
    	static int N, M;
    
    public int numIslands(char[][] grid) {
        int cnt = 0;
	N = grid.length;
	M = grid[0].length;
		
	for(int i=0; i<N; i++) {
		for(int j=0; j<M; j++) {
			if(grid[i][j]=='1') {
				dfs(i, j, grid);
				cnt++;
			}
		}
	}
        return cnt;
    }
    
    public static void dfs(int x, int y, char[][] grid) {
	grid[x][y] = '0';
				
	for(int i=0; i<4; i++) {
		int nx = x + dx[i];
		int ny = y + dy[i];
			
		if(nx<0 || ny<0 || nx>=N || ny>=M)
			continue;
		if(grid[nx][ny]=='1') {
			dfs(nx, ny, grid);
		}
	}
    }
}
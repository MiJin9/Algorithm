import java.util.*;

class Position{
	int x;
	int y;
	int cost;
	
	public Position(int x, int y, int cost){
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
}

class Solution {
    static int n,m;
    static boolean[][] visit;
	static int[] nx = {-1,1,0,0};
	static int[] ny = {0,0,-1,1};
    
    public int solution(int[][] maps) {
        n = maps.length;
		m = maps[0].length;
        
        visit = new boolean[n][m];
        return bfs(0,0,maps);
    }
    
    public static int bfs(int x, int y, int[][] maps) {
		Queue<Position> q = new LinkedList<>();
		visit[x][y] = true;
		
		q.offer(new Position(x, y, 1));
		
		while(!q.isEmpty()) {
			Position position = q.poll();
			
			if(position.x==n-1 && position.y==m-1)
				return position.cost;
						
			for(int i=0; i<4; i++) {
				int dx = position.x + nx[i];
				int dy = position.y + ny[i];

				if(dx<0 || dy<0 || dx>=n || dy>=m)
					continue;
				if(visit[dx][dy]==true)
					continue;
				if(maps[dx][dy]==0)
					continue;
				
				if(maps[dx][dy]==1 && visit[dx][dy]==false) {
					visit[dx][dy] = true;
					q.add(new Position(dx, dy, position.cost+1));
				}
			}
		}
		return -1;
    }
}
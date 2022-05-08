class Solution {
    static int n, m;
    public List<Integer> spiralOrder(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        boolean[][] visit = new boolean[n][m];
        int x = 0, y = 0;
        int dir = 0;
        
        list.add(matrix[0][0]);
        visit[0][0] = true;
        for(int i=0; i<n*m; i++){
            for(int j=0; j<4; j++){
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if(checkEnd(nx, ny) && visit[nx][ny]==false){
                    x = nx;
                    y = ny;
                    visit[x][y] = true;
                    list.add(matrix[x][y]);
                    break;
                }else{
                    dir = (dir+1)%4;
                }
            }
        }
        return list;
    }
    public boolean checkEnd(int x, int y){
        return 0<=x && x<n && 0<=y && y<m;
    }
}
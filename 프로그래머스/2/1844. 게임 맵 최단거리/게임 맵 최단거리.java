import java.util.*;

class Solution {
    int cnt = 0;
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        
        bfs(0, 0, maps, visited);
        
        return visited[n-1][m-1] ? maps[n-1][m-1] : -1;
    }
    
    private void bfs(int sr, int sc, int[][] maps, boolean[][] visited) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sr, sc});
        visited[sr][sc] = true;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (maps[nr][nc] == 0) continue;
                if (visited[nr][nc]) continue;
                
                visited[nr][nc] = true;
                maps[nr][nc] = maps[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }
    }
}
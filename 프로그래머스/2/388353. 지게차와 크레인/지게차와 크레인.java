import java.util.*;

class Solution {
    int n, m;
    boolean[][] removed;
    
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};
    
    public int solution(String[] storage, String[] requests) {
        this.n = storage.length;
        this.m = storage[0].length();
        this.removed = new boolean[n][m]; // 각 컨테이너들이 제거됐는지 여부
        int removedCount = 0;
        
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            grid[i] = storage[i].toCharArray();
        }
        
        for (String req : requests) {
            char target = req.charAt(0);
            
            if (req.length() == 2) { // target 전부 제거
                for (int r = 0; r < n; r++) {
                    for (int c = 0; c < m; c++) {
                        if (!removed[r][c] && grid[r][c] == target) {
                            removed[r][c] = true;
                            removedCount++;
                        }
                    }
                }
            } else { // 외부와 맞닿은 컨테이너만 제거
                boolean[][] outside = getOutside();
                
                List<int[]> toRemove = new ArrayList<>();
                for (int r = 0; r < n; r++) {
                    for (int c = 0; c < m; c++) {
                        if (removed[r][c]) continue;
                        if (grid[r][c] != target) continue;
                        
                        boolean accesible = false;
                        for (int k = 0; k < 4; k++) {
                            int nr = r + dr[k];
                            int nc = c + dc[k];
                            if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                                accesible = true;
                                break;
                            }
                            if (outside[nr][nc]) {
                                accesible = true;
                                break;
                            }
                        }
                        if (accesible) toRemove.add(new int[]{r, c});
                    }
                }
                
                for (int[] p : toRemove) {
                    if (!removed[p[0]][p[1]]) {
                        removed[p[0]][p[1]] = true;
                        removedCount++;
                    }
                }
            }
        }
        
        return n * m - removedCount;
    }
    
    private boolean[][] getOutside() {
        boolean[][] outside = new boolean[n][m];
        boolean[][] visited = new boolean[n+2][m+2]; 
        
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            
            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (nr < 0 || nr >= n + 2 || nc < 0 || nc >= m + 2) continue;
                if (visited[nr][nc]) continue;
                
                int gr = nr - 1;
                int gc = nc - 1;
                
                if (gr < 0 || gr >= n || gc < 0 || gc >= m) {
                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc});
                } else {
                    if (removed[gr][gc]) {
                        visited[nr][nc] = true;
                        q.add(new int[]{nr, nc});
                        outside[gr][gc] = true;
                    }
                }
            }
        }
        
        return outside;
    }
}
import java.util.*;

class Solution {
    int maxCount = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k, dungeons, visited, 0);
        
        return maxCount;
    }
    
    public void dfs(int currentK, int[][] dungeons, boolean[] visited, int cnt) {
        // 최댓값 갱신
        maxCount = Math.max(maxCount, cnt);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && currentK >= dungeons[i][0]) {
                visited[i] = true; // 방문 처리
                
                // i번째 던전을 먼저 탐색했을 때의 모든 경우의 수 구하기
                dfs(currentK - dungeons[i][1], dungeons, visited, cnt + 1);
                
                visited[i] = false; // 다른 순서에서 i번째 던전을 방문하게 되는 경우를 위함
            }
        }
    }
}
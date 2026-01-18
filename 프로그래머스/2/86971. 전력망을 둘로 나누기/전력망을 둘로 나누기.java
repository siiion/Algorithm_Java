import java.util.*;

class Solution {
    List<Integer>[] graph;
    boolean[] visited;
    int n;
    
    public int solution(int n, int[][] wires) {
        this.n = n;
        
        // 인접 리스트로 그래프 구성
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] w : wires) {
            int a = w[0], b = w[1];
            graph[a].add(b);
            graph[b].add(a);
        }
        
        int answer = Integer.MAX_VALUE;
        
        // 간선들을 하나씩 끊어보며 최소 차이 구하기
        for (int[] w : wires) {
            int a = w[0], b = w[1];
            
            visited = new boolean[n+1];
            
            int count = dfsCount(a, a, b);
            int other = n - count;
            int diff = Math.abs(count - other);
            
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
    
    // blockA-blockB 간선이 끊겼다는 가정 하에 본인 포함 연결된 노드 개수 세기 (cur 기준)
    private int dfsCount(int cur, int blockA, int blockB) {
        visited[cur] = true;
        int count = 1; 
        
        for (int next : graph[cur]) {
            if (visited[next]) continue;
            
            if ((cur == blockA && next == blockB) || (cur == blockB && next == blockA)) {
                continue;
            }
            
            count += dfsCount(next, blockA, blockB);
        }
        
        return count;
    }
}
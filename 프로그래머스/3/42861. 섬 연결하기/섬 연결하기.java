import java.util.*;

class Solution {
    int[] parent;
    int[] size;

    public int solution(int n, int[][] costs) {
        // 비용 기준 오름차순으로 정렬
        Arrays.sort(costs, (a, b) -> Integer.compare(a[2], b[2]));
        
        // Union-Find 초기화
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 0;
        }
        
        int total = 0; // 정답 (최소 시간)
        int edgesUsed = 0; // 연결된 간선의 개수
        
        for (int[] e : costs) {
            int a = e[0];
            int b = e[1];
            int w = e[2];
            
            // 다른 집합(아직 연결이 성립되지 않은 노드들)이면 연결 가능
            if (find(a) != find(b)) {
                union(a, b);
                total += w;
                edgesUsed++;
                
                if (edgesUsed == n - 1) break; // 연결된 간선의 개수가 n-1이면 다 연결된 것
            }
        }
        
        return total;     
    }
    
    // 경로 압축
    private int find(int x) {
        if (parent[x] == x) return x;
        parent[x] = find(parent[x]);
        return parent[x];
    }
    
    // 집합 형성
    private void union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra == rb) return;
        
        if (size[ra] < size[rb]) {
            parent[ra] = rb;
        } else if (size[ra] > size[rb]) {
            parent[rb] = ra;
        } else {
            parent[rb] = ra;
            size[ra]++;
        }
    }
}
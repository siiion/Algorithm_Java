import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        
        int active = 0;
        Queue<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < 24; i++) {
            if (q.size() == k) {
                active -= q.poll();
            }
            
            int need = players[i] / m;
            
            if (active < need) {
                int add = need - active;
                answer += add;
                active += add;
                q.offer(add);
            } else {
                q.offer(0);
            }
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> q = new ArrayDeque<>();
        int[] freq = new int[10];
        
        for (int i = 0; i < priorities.length; i++) {
            int p = priorities[i];
            q.addLast(new int[]{p, i});
            freq[p]++;
        }
        
        int currentMax = 9;
        while (currentMax > 0 && freq[currentMax] == 0) currentMax--;
        
        int order = 0;
        while (!q.isEmpty()) {
            int[] cur = q.pollFirst();
            int p = cur[0], idx = cur[1];
            
            if (p < currentMax) {
                q.addLast(cur);
            } else {
                order++;
                freq[p]--;
                if (idx == location) return order;
                
                if (freq[currentMax] == 0) {
                    while (currentMax > 0 && freq[currentMax] == 0) currentMax--;
                }
            }
        }
        return -1;
    }
}
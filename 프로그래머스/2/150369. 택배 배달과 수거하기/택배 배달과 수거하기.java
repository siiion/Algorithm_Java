import java.util.*;

class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        Deque<int[]> dStack = new ArrayDeque<>(); 
        Deque<int[]> pStack = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            if (deliveries[i] > 0) dStack.addLast(new int[]{i + 1, deliveries[i]});
            if (pickups[i] > 0) pStack.addLast(new int[]{i + 1, pickups[i]});
        }
        
        long answer = 0;
        
        while (!dStack.isEmpty() || !pStack.isEmpty()) {
            int far = 0;
            if (!dStack.isEmpty()) far = Math.max(far, dStack.peekLast()[0]);
            if (!pStack.isEmpty()) far = Math.max(far, pStack.peekLast()[0]);
            
            answer += 2L * far;
            
            int can = cap;
            while (can > 0 && !dStack.isEmpty()) {
                int[] top = dStack.peekLast();
                if (top[1] <= can) {
                    can -= top[1];
                    dStack.pollLast();
                } else {
                    top[1] -= can;
                    can = 0;
                }
            }
            
            can = cap;
            while (can > 0 && !pStack.isEmpty()) {
                int[] top = pStack.peekLast();
                if (top[1] <= can) {
                    can -= top[1];
                    pStack.pollLast();
                } else {
                    top[1] -= can;
                    can = 0;
                }
            }
        }
        
        return answer;
    }
}
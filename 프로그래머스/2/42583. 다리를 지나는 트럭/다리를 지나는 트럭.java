import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> bridge = new ArrayDeque<>();
        for (int i = 0; i < bridge_length; i++) bridge.addLast(0);

        int time = 0;
        int idx = 0;           
        int onBridgeWeight = 0; 

        while (idx < truck_weights.length || onBridgeWeight > 0) {
            time++;

            onBridgeWeight -= bridge.pollFirst();

            if (idx < truck_weights.length) {
                int next = truck_weights[idx];
                if (onBridgeWeight + next <= weight) {
                    bridge.addLast(next);
                    onBridgeWeight += next;
                    idx++;
                } else {
                    bridge.addLast(0); 
                }
            } else {
                bridge.addLast(0);
            }
        }

        return time;
    }
}

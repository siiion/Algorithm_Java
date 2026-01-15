import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        
        for (int[] size : sizes) {
            int curMax = Math.max(size[0], size[1]);
            int curMin = Math.min(size[0], size[1]);
            
            max = Math.max(curMax, max);
            min = Math.max(curMin, min);
        }
        
        return max * min;
    }
}
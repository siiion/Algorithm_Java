import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int index = 0;
        int count = 0;
        int total = 0;
        int end = 0;
        
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        while (count < jobs.length) {
            while (index < jobs.length && jobs[index][0] <= end) {
                pq.add(jobs[index++]);
            }
            
            if (pq.isEmpty()) {
                end = jobs[index][0];
            } else {
                int[] cur = pq.poll();
                total += cur[1] + end - cur[0];
                end += cur[1];
                count++;
            }
        }
        
        return total / jobs.length;
    }
}
import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = routes.length;
        
        if (routes.length == 1) return 1;
        
        Arrays.sort(routes, (a, b) -> Integer.compare(a[0], b[0]));
        
        for (int i = 0; i < routes.length - 1; i++) {
            int sp = routes[i][0];
            int ep = routes[i][1];
            for (int j = i + 1; j < routes.length; j++) {
                if (routes[j][0] > ep) {
                    break;
                } else {
                    i++;
                    ep = Math.min(ep, routes[j][1]);
                    answer--;
                }
            }
        }
        
        return answer;
    }
}
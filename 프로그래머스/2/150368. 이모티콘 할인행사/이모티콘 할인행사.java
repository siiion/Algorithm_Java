import java.util.*;

class Solution {
    private static final int[] RATES = {10, 20, 30, 40};
    
    int[][] users;
    int[] emoticons;
    int m, n;
    
    int bestSubs = -1;
    int bestRevenue = -1;
    
    public int[] solution(int[][] users, int[] emoticons) {
        this.users = users;
        this.emoticons = emoticons;
        this.n = users.length;
        this.m = emoticons.length;
        
        int[] choice = new int[m];
        dfs(0, choice);
        
        return new int[] { bestSubs, bestRevenue };
    }
    
    private void dfs(int idx, int[] choice) {
        if (idx == m) {
            evaluate(choice);
            return;
        }
        for (int r : RATES) {
            choice[idx] = r;
            dfs(idx + 1, choice);
        }
    }
    
    private void evaluate(int[] choice) {
        int subscribers = 0;
        int revenue = 0;
        
        for (int i = 0; i < n; i++) {
            int minRate = users[i][0];
            int priceLimit = users[i][1];
            
            int sum = 0;
            for (int j = 0; j < m; j++) {
                if (choice[j] >= minRate) {
                    sum += emoticons[j] * (100 - choice[j]) / 100;
                }
            }
            
            if (sum >= priceLimit) {
                subscribers++;
            } else {
                revenue += sum;
            }
        }
        
        if (subscribers > bestSubs ||
           (subscribers == bestSubs && revenue > bestRevenue)) {
            bestSubs = subscribers;
            bestRevenue = revenue;
        }
    }
}
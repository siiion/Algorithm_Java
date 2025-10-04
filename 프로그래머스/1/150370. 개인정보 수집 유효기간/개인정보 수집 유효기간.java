import java.util.*;

class Solution {
   private int toDays(String ymd) {
        String[] p = ymd.split("\\.");
        int y = Integer.parseInt(p[0]);
        int m = Integer.parseInt(p[1]);
        int d = Integer.parseInt(p[2]);
        return y * 12 * 28 + m * 28 + d;
    }
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        int todayDays = toDays(today);
        
        Map<String, Integer> monthsByType = new HashMap<>();
        for (String term : terms) {
            String[] t = term.split(" ");
            monthsByType.put(t[0], Integer.parseInt(t[1]));
        }
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] p = privacies[i].split(" ");
            int collected = toDays(p[0]);
            int months = monthsByType.get(p[1]);
            int expire = collected + months * 28 - 1;
            
            if (expire < todayDays) res.add(i + 1);
        }
        
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
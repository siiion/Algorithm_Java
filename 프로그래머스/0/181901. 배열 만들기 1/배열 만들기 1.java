import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                arrList.add(i);
            }
        }
        
        int[] answer = arrList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
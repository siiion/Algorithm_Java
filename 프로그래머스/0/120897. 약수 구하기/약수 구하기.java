import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arrList.add(i);
            }
        }
        
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
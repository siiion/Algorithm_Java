import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                n /= i;
                if (!arrList.contains(i)) {
                    arrList.add(i);
                }
                i--;
            }
        }
        
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
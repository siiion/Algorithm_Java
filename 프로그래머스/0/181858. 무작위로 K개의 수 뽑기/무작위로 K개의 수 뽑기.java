import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
            
            if (result.size() == k) break;
        }
        
        while (result.size() < k) {
            result.add(-1);
        }
        
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
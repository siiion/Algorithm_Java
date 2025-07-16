import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> arrList = new ArrayList<>();
        
        for (char c : my_string.toCharArray()) {
            if (c - '0' >= 0 && c - '0' <= 9) {
                arrList.add(c - '0');
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
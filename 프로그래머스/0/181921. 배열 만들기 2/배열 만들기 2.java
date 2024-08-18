import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> arrList = new ArrayList<>();
        boolean isCorrect = false;
        for (int i = l; i <= r; i++) {
            String s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '0' || s.charAt(j) == '5') {
                    isCorrect = true;
                    continue;
                } else {
                    isCorrect = false;
                    break;
                }
            }
            if (isCorrect) {
                int num = Integer.parseInt(s);
                arrList.add(num);
            }
        }
        if (arrList.size() == 0) {
            int[] answer = {-1};
            return answer;
        } else {
            int[] answer = new int[arrList.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arrList.get(i);
            }
            return answer;
        }
    }
}
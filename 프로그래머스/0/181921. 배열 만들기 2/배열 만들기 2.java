import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        boolean flag = true;
        
        for (int i = l; i <= r; i++) {
            String s = i + "";
            for (char c : s.toCharArray()) {
                if (c != '0' && c != '5') {
                    flag = false;
                }
            }
            if (flag) {
                list.add(i);
            }
            flag = true;
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        int[] empty = {-1};
        if (answer.length == 0) {
            answer = empty;
        }
        return answer;
    }
}
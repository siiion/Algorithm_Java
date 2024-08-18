import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                arrList.add(n);
            } else {
                n = 3 * n + 1;
                arrList.add(n);
            }
        }
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
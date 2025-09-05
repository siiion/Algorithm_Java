import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        List<Integer> arrList = new ArrayList<>();
        int start = 0;
        int remain = 0;
        for (int i = 1; i < num; i++) {
            remain += i;
        }
        start = (total - remain) / num;
        
        for (int i = start; i < start + num; i++) {
            arrList.add(i);
        }
        
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}
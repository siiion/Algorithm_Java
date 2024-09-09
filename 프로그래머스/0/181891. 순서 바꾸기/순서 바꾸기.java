import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] before = Arrays.copyOfRange(num_list, 0, n);
        int[] after = Arrays.copyOfRange(num_list, n, num_list.length);
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < after.length; i++) {
            arrList.add(after[i]);
        }
        
        for (int i = 0; i < before.length; i++) {
            arrList.add(before[i]);
        }
        
        int[] answer = new int[arrList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}
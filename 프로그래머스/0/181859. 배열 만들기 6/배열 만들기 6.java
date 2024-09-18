import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (i != 0 && stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
                i++;
            } else if (i != 0 && stk.get(stk.size() - 1) != arr[i]) {
                stk.add(arr[i]);
                i++;
            }
        }
        
        if (stk.size() == 0) {
            stk.add(-1);
        }
        
        int[] answer = new int[stk.size()];
        
        for (int j = 0; j < answer.length; j++) {
            answer[j] = stk.get(j);
        }
        
        return answer;
    }
}
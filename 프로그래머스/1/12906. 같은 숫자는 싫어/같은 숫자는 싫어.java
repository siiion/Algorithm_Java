import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stk = new Stack<>();
        
        for (int i : arr) {
            if (stk.empty() || stk.peek() != i) {
                stk.push(i);
            }
        }

        return stk.stream().mapToInt(i -> i).toArray();
    }
}
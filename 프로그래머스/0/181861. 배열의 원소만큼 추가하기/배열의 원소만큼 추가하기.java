import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> arrList = new ArrayList<>();
        
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                arrList.add(i);
            }
        }
        
        return arrList.stream().mapToInt(i->i).toArray();
    }
}
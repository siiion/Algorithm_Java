import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                arrList.add(arr[j]);
            }
        }
        
        int[] answer = arrList.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}
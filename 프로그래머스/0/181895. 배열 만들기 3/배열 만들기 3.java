import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        
        for (int i = a1; i <= b1; i++) {
            arrList.add(arr[i]);
        }
        
        for (int i = a2; i <= b2; i++) {
            arrList.add(arr[i]);
        }
        
        int[] answer = new int[arrList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}
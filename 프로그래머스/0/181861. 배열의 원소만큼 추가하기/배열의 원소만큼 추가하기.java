import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                arrList.add(i);
            }
        }
        
        int[] answer = new int[arrList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}
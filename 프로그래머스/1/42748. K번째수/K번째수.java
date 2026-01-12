import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];
            
            int[] cut = new int[end-start+1];
            for (int j = 0; j < cut.length; j++) {
                cut[j] = array[j+start-1];
            }
            
            Arrays.sort(cut);
            answer[i] = cut[target-1];
        }
        
        return answer;
    }
}
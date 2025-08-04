class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int maxX = board[0] / 2;
        int minX = -(board[0] / 2);
        int maxY = board[1] / 2;
        int minY = -(board[1] / 2);
        
        for (int i = 0; i < keyinput.length; i++) {
            String s = keyinput[i];
            
            if (s.equals("left")) {
                if (answer[0] - 1 >= minX) answer[0]--;
            } else if (s.equals("right")) {
                if (answer[0] + 1 <= maxX) answer[0]++;
            } else if (s.equals("up")) {
                if (answer[1] + 1 <= maxY) answer[1]++;
            } else {
                if (answer[1] - 1 >= minY) answer[1]--;
            }
        }
        
        return answer;
    }
}
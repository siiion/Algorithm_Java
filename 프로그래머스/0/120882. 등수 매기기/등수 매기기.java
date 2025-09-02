class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sum = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        for (int i = 0; i < sum.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < sum.length; j++) {
                if (sum[j] > sum[i]) answer[i]++;
            }
        }
        
        return answer;
    }
}
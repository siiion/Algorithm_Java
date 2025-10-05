class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int sec = 0;
            for (int j = i + 1; j < n; j++) {
                sec++;
                if (prices[i] > prices[j]) break;
            }
            answer[i] = sec;
        }
        return answer;
    }
}
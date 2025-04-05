class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        while (true) {
            answer++;
            if (answer * slice / n >= 1) {
                break;
            }
        }
        return answer;
    }
}
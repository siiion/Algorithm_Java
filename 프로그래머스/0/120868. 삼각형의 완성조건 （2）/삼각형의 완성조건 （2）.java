class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longer = sides[0] > sides[1] ? sides[0] : sides[1];
        int shorter = longer == sides[0] ? sides[1] : sides[0];
        
        for (int i = longer - shorter + 1; i < longer; i++) {
            answer++;
        }
        
        for (int i = longer; i < longer + shorter; i++) {
            answer++;
        }
        
        return answer;
    }
}
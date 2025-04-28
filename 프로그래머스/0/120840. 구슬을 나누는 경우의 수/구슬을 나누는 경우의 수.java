class Solution {
    public int solution(int balls, int share) {
        double answer = 1;
        
        for (int i = balls; i > balls - share; i--) {
            answer *= i;
        }
        
        for (int i = share; i > 0; i--) {
            answer /= i;
        }
        
        return (int)answer;
    }
}
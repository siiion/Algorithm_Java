class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int ari1 = common[1] - common[0];
        int ari2 = common[2] - common[1];
        
        if (ari1 == ari2) {
            answer = common[common.length - 1] + ari1;
        } else {
            int geo1 = common[1] / common[0];
            answer = common[common.length - 1] * geo1;
        }
        
        return answer;
    }
}
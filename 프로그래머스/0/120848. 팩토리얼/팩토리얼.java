class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        int pactorial = 1;
        
        while (pactorial <= n) {
            pactorial *= i;
            
            if (pactorial <= n) {
                i++;
            } else {
                break;
            }
        }
        
        return --i;
    }
}
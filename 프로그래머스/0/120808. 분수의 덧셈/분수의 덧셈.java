class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = 1;
        int denom = 1;
        
        numer = numer1 * denom2 + numer2 * denom1;
        denom = denom1 * denom2;
        
        if (numer > denom) {
            for (int i = denom; i > 1; i--) {
                if ((numer % i == 0) && (denom % i == 0)) {
                    numer /= i;
                    denom /= i;
                    i = denom;
                }
            }
        } else if (numer == denom) {
            numer = 1;
            denom = 1;
        } else {
            for (int i = numer; i > 1; i--) {
                if ((numer % i == 0) && (denom % i == 0)) {
                    numer /= i;
                    denom /= i;
                    i = numer;
                }
            }
        }
        
        answer[0] = numer;
        answer[1] = denom;
        
        return answer;
    }
}
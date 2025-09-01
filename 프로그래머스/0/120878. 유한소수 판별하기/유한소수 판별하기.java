class Solution {
    public int solution(int a, int b) {
        int max = a > b ? a : b;
        
        for (int i = max; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        
        for (int i = b; i >= 1; i--) {
            if (b % 2 == 0) {
                b /= 2;
            } 
            if (b % 5 == 0) {
                b /= 5;
            }
        }
        
        return b == 1 ? 1 : 2;
    }
}
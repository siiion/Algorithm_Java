class Solution {
    public int[] solution(int brown, int yellow) {
        for (int i = 3; i <= Math.max(brown, yellow); i++) {
            for (int j = 3; j <= i; j++) {
                if ((i-2) * (j-2) == yellow && i * 2 + ((j-2) * 2) == brown) {
                    return new int[]{i, j};
                }
            }
        }
        
        return new int[]{};
    }
    
}
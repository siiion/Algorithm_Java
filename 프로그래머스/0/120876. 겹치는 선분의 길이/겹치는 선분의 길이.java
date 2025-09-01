class Solution {
    public int solution(int[][] lines) {
        int shift = 100;
        int[] cover = new int[200];
        
        for (int[] line : lines) {
            int a = line[0];
            int b = line[1];
            for (int i = a; i < b; i++) {
                cover[i + shift]++;
            }
        }
        
        int ans = 0;
        
        for (int c : cover) {
            if (c >= 2) ans++;
        }
        
        return ans;
    }
}
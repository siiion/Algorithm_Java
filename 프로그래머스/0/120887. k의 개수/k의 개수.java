class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int now = i; now <= j; now++) {
            String str = Integer.toString(now).replaceAll(Integer.toString(k), " ");
            for (char c : str.toCharArray()) {
                if (c == ' ') answer++;
            }
        }
        
        return answer;
    }
}
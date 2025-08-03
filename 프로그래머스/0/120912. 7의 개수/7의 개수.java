class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            String s = array[i] + "";
            
            for (char c : s.toCharArray()) {
                if(c == '7') answer++;
            }
        }
        
        return answer;
    }
}
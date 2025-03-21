class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for (int i = 0; i < myString.length(); i++) {
            String s = myString.substring(0, i+1);
            if (s.endsWith(pat)) {
                answer++;
            }
        }
        
        return answer;
    }
}
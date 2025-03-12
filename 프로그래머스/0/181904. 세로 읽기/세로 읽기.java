class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        
        for (int i = c - 1; i < charArr.length; i += m) {
            answer += charArr[i];
        }
        
        return answer;
    }
}
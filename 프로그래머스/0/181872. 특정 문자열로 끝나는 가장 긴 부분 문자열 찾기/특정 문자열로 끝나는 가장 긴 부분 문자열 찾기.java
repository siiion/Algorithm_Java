class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for (int i = myString.length() - 1; i >= 0; i--) {
            String subString = myString.substring(0, i + 1);
            if (subString.endsWith(pat)) {
                answer = subString;
                break;
            }
        }
        
        return answer;
    }
}
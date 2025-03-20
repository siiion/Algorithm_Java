class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (char c : myString.toCharArray()) {
            answer += Character.toLowerCase(c);
        }
        
        return answer;
    }
}
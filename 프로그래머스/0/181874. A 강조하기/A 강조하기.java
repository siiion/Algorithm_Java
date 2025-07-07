class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            
            if (ch == 'a') {
                answer += "A";
            } else if (ch > 'A' && ch < 'a') {
                answer += Character.toLowerCase(ch);
            } else {
                answer += ch;
            }
        }
        
        return answer;
    }
}
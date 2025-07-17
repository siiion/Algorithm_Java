class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (String w : my_string.split("")) {
            if (!answer.contains(w)) {
                answer += w;
            }
        }
        
        return answer;
    }
}
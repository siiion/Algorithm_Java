class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        if (is_suffix.length() >= my_string.length()) {
            if (is_suffix.equals(my_string)) {
                answer = 1;
            }
        } else if (my_string.substring(my_string.length() - is_suffix.length()).equals(is_suffix)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}
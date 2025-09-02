class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (String b : babbling) {
            String temp = b;
            for (String w : words) {
                temp = temp.replace(w, " ");
            }
            temp = temp.replace(" ", "");
            if (temp.equals("")) answer++;
        }
        
        return answer;
    }
}
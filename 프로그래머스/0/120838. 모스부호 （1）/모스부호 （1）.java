class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = { 
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        
        String[] letterArr = letter.split(" ");
        
        for (String let : letterArr) {
            for (int i = 0; i < morse.length; i++) {
                if (let.equals(morse[i])) {
                    answer += (char)(97 + i);
                }
            }
        }

        
        return answer;
    }
}
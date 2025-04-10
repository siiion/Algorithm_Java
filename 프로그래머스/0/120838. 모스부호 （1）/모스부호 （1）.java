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
        
        int ascii = 97;
        for (String s : letterArr) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(s)) {
                    answer += (char)(ascii + i);
                }
            }
        }
        
        return answer;
    }
}
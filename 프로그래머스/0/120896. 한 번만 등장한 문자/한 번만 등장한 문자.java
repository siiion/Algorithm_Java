import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                answer += c;
            }
            count = 0;
        }
        
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);
        String result = new String(arr);
        
        return result;
    }
}
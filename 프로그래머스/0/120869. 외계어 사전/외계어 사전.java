import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int result = 2;
        
        Arrays.sort(spell);
        String key = String.join("", spell);
        
        for (String word : dic) {
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if (s.equals(key)) {
                result = 1;
                break;
            }
        }
        
        return result;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> arrList = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            arrList.add(my_string.substring(i));
        }
        
        String[] answer = new String[arrList.size()];
        
        for (int j = 0; j < answer.length; j++) {
            answer[j] = arrList.get(j);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
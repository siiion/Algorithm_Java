import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> arrList = new ArrayList<>();
        arrList.add(names[0]);
        
        if (names.length >= 5) {
            for (int i = 5; i < names.length; i+= 5) {
            arrList.add(names[i]);
        }
        }
        
        String[] answer = new String[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}
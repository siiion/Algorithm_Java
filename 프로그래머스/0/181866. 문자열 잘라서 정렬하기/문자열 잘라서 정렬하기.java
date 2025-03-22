import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> arrList = new ArrayList<>();
        
        for (String s : arr) {
            if (!s.isEmpty()) {
                arrList.add(s);
            }
        }
        
        String[] answer = new String[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> arrList = new ArrayList<>();
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                continue;
            } else {
                arrList.add(strArr[i]);
            }
        }
        
        String[] answer = new String[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}
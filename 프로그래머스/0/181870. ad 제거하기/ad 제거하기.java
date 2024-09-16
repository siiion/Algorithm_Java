import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arrList = new ArrayList<>();
        
        for (String s : strArr) {
            if (!s.contains("ad")) {
                arrList.add(s);
            }
        }
        
        String[] answer = new String[arrList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}
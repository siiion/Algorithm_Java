import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> arrList = new ArrayList<>();
        String temp = "";
        boolean isContinue = false;
        
        for (char c : myStr.toCharArray()) {
            if (c != 'a' && c != 'b' && c != 'c') {
                temp += c;
                isContinue = true;
            } else {
                if (isContinue) {
                    arrList.add(temp);
                    temp = "";
                    isContinue = false;
                }
            }
        }
        arrList.add(temp);
        
        String[] answer = new String[arrList.size()];
        if (arrList.get(0) == "") {
            answer[0] = "EMPTY";
        } else {
            for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        }
        
        return answer;
    }
}
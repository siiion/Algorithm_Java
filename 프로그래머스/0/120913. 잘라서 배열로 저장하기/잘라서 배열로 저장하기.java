import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> arrList = new ArrayList<>();
        int idx = 0;
        
        while (true) {
            if (idx + n >= my_str.length()) {
                arrList.add(my_str.substring(idx));
                break;
            } else {
                arrList.add(my_str.substring(idx, idx + n));
                idx += n;
            }
        }
        
        String[] answer = new String[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
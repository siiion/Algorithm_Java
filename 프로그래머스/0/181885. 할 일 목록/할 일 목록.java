import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> arrList = new ArrayList<>();
        
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                arrList.add(todo_list[i]);
            }
        }
        
        String[] answer =  new String[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}
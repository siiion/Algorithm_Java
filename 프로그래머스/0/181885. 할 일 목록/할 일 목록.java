import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arrList = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                arrList.add(todo_list[i]);
            }
        }
        
        String[] answer = new String[arrList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}
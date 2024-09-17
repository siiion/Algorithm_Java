import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> arrList = new ArrayList<>();
        
        for (String s : splitArr) {
            if (!s.isEmpty()) {
                arrList.add(s);
            }
        }
        
        String[] answer = arrList.toArray(new String[arrList.size()]);
        Arrays.sort(answer);
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int index = -1;
        String direction = "";
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                direction += "l";
                index = i;
                break;
            } else if (str_list[i].equals("r")) {
               direction += "r";
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            if (direction.equals("l")) {
                 return Arrays.copyOfRange(str_list, 0, index);
            } else {
                return Arrays.copyOfRange(str_list, index + 1, str_list.length);
            }
        } else {
            return answer;
        }
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> arrList = new ArrayList<>();
        
        for (int i = 0; i < picture.length; i++) {
            String[] strList = picture[i].split("");
            String str = "";
            for (int j = 0; j < strList.length; j++) {
                str += strList[j].repeat(k);
            }
            for (int l = 0; l < k; l++) {
                arrList.add(str);
            }
        }
        
        return arrList.toArray(new String[arrList.size()]);
    }
}
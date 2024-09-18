import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        String[] result = myStr.split("\\s+");
        ArrayList<String> arrList = new ArrayList<>();
        
        for (String s : result) {
            if (!s.isEmpty()) {
                arrList.add(s);
            }
        }
        
        if (arrList.size() == 0) {
            arrList.add("EMPTY");
        }
    
        return arrList.toArray(new String[arrList.size()]);
    }
}
import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arrList = new ArrayList<>();
        for (String str : intStrs) {
            char[] arr = str.toCharArray();
            String part = "";
            
            for (int i = s; i < s + l; i++) {
                part += arr[i];
            }
            
            int partInt = Integer.parseInt(part);
            if (partInt > k) {
                arrList.add(partInt);
            }
        }
        
        int[] answer = arrList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
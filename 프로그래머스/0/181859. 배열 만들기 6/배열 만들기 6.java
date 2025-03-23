import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (arrList.isEmpty()) {
                arrList.add(arr[i]);
                i++;
            } else if (arrList.get(arrList.size() - 1) == arr[i]) {
                arrList.remove(arrList.size() - 1);
                i++;
            } else {
                arrList.add(arr[i]);
                i++;
            }
        }
        
        if (arrList.isEmpty()) {
            arrList.add(-1);
        }
        
        return arrList.stream().mapToInt(j->j).toArray();
    }
}
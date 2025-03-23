import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    arrList.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    arrList.remove(arrList.size() - 1);
                }
            }
        }
        
        return arrList.stream().mapToInt(i->i).toArray();
    }
}
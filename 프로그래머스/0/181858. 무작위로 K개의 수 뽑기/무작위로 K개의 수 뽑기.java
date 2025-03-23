import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arrList.size() == k) {
                break;
            }
            if (!arrList.contains(arr[i])) {
                arrList.add(arr[i]);
            }
        }
        
        while (arrList.size() < k) {
            arrList.add(-1);
        }
        
        return arrList.stream().mapToInt(i->i).toArray();
    }
}
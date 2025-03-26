import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> arrList = new ArrayList<>();
        
        for (int i : arr) {
            arrList.add(i);
        }
        
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < delete_list.length; k++) {
                if (arr[j] == delete_list[k]) {
                    arrList.remove(Integer.valueOf(arr[j]));
                }
            }
        }
        
        return arrList.stream().mapToInt(i->i).toArray();
    }
}
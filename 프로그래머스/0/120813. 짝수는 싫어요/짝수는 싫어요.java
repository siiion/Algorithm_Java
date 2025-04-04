import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 1; i <= n; i += 2) {
            arrList.add(i);
        }
        
        return arrList.stream().mapToInt(i->i).toArray();
    }
}
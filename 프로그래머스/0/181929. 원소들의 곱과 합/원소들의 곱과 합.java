import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int times = 1;
        int sum = 0;
        for (int i : num_list) {
            times *= i;
            sum += i;
        }
        return times < Math.pow(sum, 2) ? 1 : 0;
    }
}
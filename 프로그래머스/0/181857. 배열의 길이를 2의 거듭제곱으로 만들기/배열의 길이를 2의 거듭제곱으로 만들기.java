import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = 1;
        
        while (length < arr.length) {
            length *= 2;
        }
        
        arr = Arrays.copyOf(arr, length);
        
        return arr;
    }
}
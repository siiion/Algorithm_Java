import java.util.*;

class Solution {
    public int[] solution(long[] numbers) {
        int[] ans = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            String bin = Long.toBinaryString(numbers[i]);
            int L = fullLength(bin.length());
            String padded = "0".repeat(L - bin.length()) + bin;
            
            ans[i] = isValid(padded) ? 1 : 0;
        }
        return ans;
    }
    
    private int fullLength(int len) {
        int h = 1;
        while ((1 << h) - 1 < len) h++;
        return (1 << h) - 1;
    }
    
    private boolean isValid(String s) {
        if (s.length() == 1) return true;
        
        int mid = s.length() / 2;
        char root = s.charAt(mid);
        
        String left = s.substring(0, mid);
        String right = s.substring(mid + 1);
        
        if (root == '0') {
            if (containsOne(left) || containsOne(right)) return false;
        }
        return isValid(left) && isValid(right);
    }
    
    private boolean containsOne(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') return true;
        }
        return false;
    }
}
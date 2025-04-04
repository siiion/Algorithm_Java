import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : array) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = 0;
        int mode = -1;
        boolean isDuplicated = false;
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > maxFreq) {
                maxFreq = frequency;
                mode = number;
                isDuplicated = false;
            } else if (frequency == maxFreq) {
                isDuplicated = true;
            }
        }
        
        return isDuplicated ? -1 : mode;
    }
}
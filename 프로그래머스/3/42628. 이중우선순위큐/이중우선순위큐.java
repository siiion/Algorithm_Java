import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        
        for (String s : operations) {
            String[] operation = s.split(" ");
            String operator = operation[0];
            int value = Integer.parseInt(operation[1]);
            
            if (operator.equals("I")) {
                tm.put(value, tm.getOrDefault(value, 0) + 1);
            } else {
                if (tm.isEmpty()) continue;
                
                int target = (value == 1) ? tm.lastKey() : tm.firstKey();
                
                if (tm.get(target) == 1) {
                    tm.remove(target);
                } else {
                    tm.put(target, tm.get(target) - 1);
                }
            }
        }
        
        if (tm.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{tm.lastKey(), tm.firstKey()};
        }
    }
}
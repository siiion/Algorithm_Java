import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int sp = people.length - 1;
        boolean isMatch = false;
        
        if (people.length == 1) return 1;
        
        for (int i = 0; i <= sp; i++) {
            isMatch = false;
            
            for (int j = sp; j > i; j--) {
                if (people[i] + people[j] <= limit) {
                    answer += sp - j + 1;
                    sp = j - 1;
                    isMatch = true;
                    break;
                } 
            }
            
            if (!isMatch) {
                answer += sp - i + 1;
                break;
            }
        }
        
        return answer;
    }
}
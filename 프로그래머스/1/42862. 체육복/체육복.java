import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n+1];
        Arrays.fill(students, 1); // 초깃값: 1로 채우기
        
        // lost: -1 / reserve: +1
        for (int l : lost) {
            students[l]--;
        }
        for (int r : reserve) {
            students[r]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (students[i] == 0) {
                if (i-1 != 0 && students[i-1] == 2) {
                    students[i-1]--;
                    students[i]++;
                } else if (i+1 <= n && students[i+1] == 2) {
                    students[i+1]--;
                    students[i]++;
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (students[i] > 0) answer++;
        }
        
        return answer;
    }
}
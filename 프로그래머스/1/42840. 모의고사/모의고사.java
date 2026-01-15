import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) s1++;
            if (answers[i] == p2[i % p2.length]) s2++;
            if (answers[i] == p3[i % p3.length]) s3++;
        }
        
        int max = Math.max(s1, Math.max(s2, s3));
        ArrayList<Integer> answer = new ArrayList<>();
        if (max == s1) answer.add(1);
        if (max == s2) answer.add(2);
        if (max == s3) answer.add(3);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}


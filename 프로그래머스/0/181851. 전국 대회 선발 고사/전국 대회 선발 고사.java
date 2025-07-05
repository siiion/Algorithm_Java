import java.util.*;

public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> students = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            students.add(new int[]{i, rank[i]});
        }
        
        students.sort(Comparator.comparingInt(a -> a[1]));

        List<Integer> selected = new ArrayList<>();
        for (int[] student : students) {
            int idx = student[0];
            if (attendance[idx]) {
                selected.add(idx);
                if (selected.size() == 3) break;
            }
        }

        int a = selected.get(0);
        int b = selected.get(1);
        int c = selected.get(2);
        return 10000 * a + 100 * b + c;
    }
}

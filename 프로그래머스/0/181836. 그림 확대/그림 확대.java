import java.util.*;

public class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> enlarged = new ArrayList<>();

        for (String row : picture) {
            StringBuilder enlargedRow = new StringBuilder();
            for (char ch : row.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    enlargedRow.append(ch);
                }
            }

            for (int i = 0; i < k; i++) {
                enlarged.add(enlargedRow.toString());
            }
        }

        return enlarged.toArray(new String[0]);
    }
}

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] times = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            times[i] = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
        }
        
        int largest = times[0];
        int tasks = 1;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i < times.length; i++) {
            if (times[i] <= largest) {
                tasks++;
            } else {
                answer.add(tasks);
                tasks = 1;
                largest = times[i];
            }
        }
        answer.add(tasks);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
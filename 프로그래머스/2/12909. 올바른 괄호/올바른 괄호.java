import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                deque.addLast(c);
            } else {
                if (deque.isEmpty()) {
                    answer = false;
                    break;
                } else if (deque.peekLast() == ')') {
                    answer = false;
                    break;
                } else {
                    deque.removeLast();
                }
            }
        }
        
        if (!deque.isEmpty()) answer = false;

        return answer;
    }
}
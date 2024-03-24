import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] array = my_string.split("");
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i].charAt(0))) {
                answer += array[i].toLowerCase();
            } else {
                answer += array[i].toUpperCase();
            }
        }
        return answer;
    }
}
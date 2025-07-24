import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        char[] arr = numbers.toCharArray();
        List<Integer> numList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; ) {
            if (arr[i] == 'z') {
                numList.add(0);
                i += 4;
            } else if (arr[i] == 'o') {
                numList.add(1);
                i += 3;
            } else if (arr[i] == 't') {
                i++;
                if (arr[i] == 'w') {
                    numList.add(2);
                    i += 2;
                } else {
                    numList.add(3);
                    i += 4;
                }
            } else if (arr[i] == 'f') {
                i++;
                if (arr[i] == 'o') {
                    numList.add(4);
                    i += 3;
                } else {
                    numList.add(5);
                    i += 3;
                }
            } else if (arr[i] == 's') {
                i++;
                if (arr[i] == 'i') {
                    numList.add(6);
                    i += 2;
                } else {
                    numList.add(7);
                    i += 4;
                }
            } else if (arr[i] == 'e') {
                numList.add(8);
                i += 5;
            } else {
                numList.add(9);
                i += 4;
            }
        }
        
        for (int i = 0; i < numList.size(); i++) {
            answer += (long)numList.get(numList.size() - i - 1) * Math.pow(10, i);
        }
        
        return answer;
    }
}
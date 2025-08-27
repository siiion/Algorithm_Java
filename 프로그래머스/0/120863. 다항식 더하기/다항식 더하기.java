import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int xSum = 0;
        int nSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].endsWith("x")) {
                if (arr[i].startsWith("x")) {
                    xSum += 1;
                } else {
                    xSum += Integer.parseInt(arr[i].split("x")[0]);
                }
            } else if (!arr[i].equals("+")) {
                nSum += Integer.parseInt(arr[i]);
            }
        }
        
        if (xSum != 0) {
            if (xSum == 1) {
                answer = "x";
            } else {
                answer = Integer.toString(xSum) + "x";
            }
        }
        
        if (nSum != 0) {
            if (xSum != 0) {
                answer += " + " + Integer.toString(nSum);
            } else {
                answer = Integer.toString(nSum);
            }
        }
        
        if (xSum == 0 && nSum == 0) {
            answer = "0";
        }
        
        return answer;
    }
}
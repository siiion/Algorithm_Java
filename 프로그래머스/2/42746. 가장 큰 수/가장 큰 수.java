import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 문자열 배열로 변경
        String[] arr= new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        // 이어 붙였을 때 가장 큰 수가 될 수 있도록 배열 정렬
        // 요소 2개씩 비교 -> 순서대로 이어붙였을 때 더 큰 수가 되도록
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        
        // 모두 0인 경우 (첫번째 요소가 0)
        if (arr[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for (String s : arr) sb.append(s);
        
        return sb.toString();
    }
}
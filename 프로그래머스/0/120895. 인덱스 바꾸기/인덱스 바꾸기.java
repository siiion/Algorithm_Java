class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}
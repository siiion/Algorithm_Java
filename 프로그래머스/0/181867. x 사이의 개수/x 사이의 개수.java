class Solution {
    public int[] solution(String myString) {
        String[] split_arr = myString.split("x");
        int answer_length = 0;
        
        if (myString.endsWith("x")) {
            answer_length = split_arr.length + 1;
        } else {
            answer_length = split_arr.length;
        }
        
        int[] answer = new int[answer_length];
        
        for (int i = 0; i < split_arr.length; i++) {
            answer[i] = split_arr[i].length();
        }
        
        if (myString.endsWith("x")) {
            answer[answer.length - 1] = 0;
        }
        
        return answer;
    }
}
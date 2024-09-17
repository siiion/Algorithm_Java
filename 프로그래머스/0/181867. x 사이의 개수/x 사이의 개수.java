class Solution {
    public int[] solution(String myString) {
        String[] split_arr = myString.split("x", -1);
        int[] answer = new int[split_arr.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = split_arr[i].length();
        }
        
        return answer;
    }
}
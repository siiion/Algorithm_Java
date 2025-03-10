class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for (int i : index_list) {
            answer += arr[i];
        }
        return answer;
    }
}
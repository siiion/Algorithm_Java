class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        int place = 1;
        
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                answer += (arr[i] - '0') * place;
                if (arr[i - 1] >= '0' && arr[i - 1] <= '9') {
                    place *= 10;
                } else {
                    place = 1;
                }
            }
        }
        
        if (arr[0] >= '0' && arr[0] <= '9') {
            answer += (arr[0] - '0') * place;
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int max = 1;
        
        while (true) {
            if (max >= length) break;
            
            max *= 2;
        }
        
        int[] answer = new int[max];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        for (int i = arr.length; i < max; i++) {
            answer[i] = 0;
        }
        
        return answer;
    }
}
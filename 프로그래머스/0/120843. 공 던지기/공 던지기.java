class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        
        for (int i = 1; i < k; i++) {
            index += 2;
            if (index == numbers.length) {
                index = 0;
            } else if (index > numbers.length) {
                index = 1;
            } 
            answer = numbers[index];
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int[] numbers, int k) {
        int num = 1;
        
        for (int i = 1; i < k; i++) {
            if (num == numbers[numbers.length - 1]) {
                num = 2;
            } else if (num + 2 <= numbers[numbers.length - 1]) {
                num += 2;
            } else {
                num = 1;
            }
        }
        
        return num;
    }
}
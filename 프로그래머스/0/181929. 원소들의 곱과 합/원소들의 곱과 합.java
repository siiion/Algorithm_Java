class Solution {
    public int solution(int[] num_list) {
        int multipleSum = 1;
        int sum = 0;
        for (int n : num_list) {
            multipleSum *= n;
            sum += n;
        }
        
        return multipleSum < sum * sum ? 1 : 0;
    }
}
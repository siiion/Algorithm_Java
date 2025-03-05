class Solution {
    public int solution(int[] num_list) {
        int evenList = 0;
        int oddList = 0;
        for (int n : num_list) {
            if (n % 2 == 0) {
                evenList = Integer.parseInt("" + evenList + n);
            } else {
                oddList = Integer.parseInt("" + oddList + n);
            }
        }
        return evenList + oddList;
    }
}
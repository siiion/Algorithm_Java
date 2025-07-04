class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        
        if (arr1.length == arr2.length) {
            for (int i : arr1) {
                sum1 += i;
            }
            for (int j : arr2) {
                sum2 += j;
            }
            
            if (sum1 == sum2) return 0;
            return sum1 > sum2 ? 1 : -1;
        } else {
            return arr1.length > arr2.length ? 1 : -1;
        }
    }
}
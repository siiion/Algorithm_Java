class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int smallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && arr[j] < smallest) {
                    smallest = arr[j];
                }
            }
            answer[i] = smallest == Integer.MAX_VALUE ? -1 : smallest;
            smallest = Integer.MAX_VALUE;
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int smallest = 1000000;
        for (int i = 0; i < queries.length; i++) {
            answer[i] = -1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    if (arr[j] < smallest) {
                        smallest = arr[j];
                        answer[i] = smallest;
                    }
                } 
            }
            smallest = 1000000;
        }
        return answer;
    }
}
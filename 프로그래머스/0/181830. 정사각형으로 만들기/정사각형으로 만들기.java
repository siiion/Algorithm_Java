class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        if (row == col) {
            return arr;
        } else if (row > col) {
            return makeSquare(row, arr);
        } else {
            return makeSquare(col, arr);
        }
    }
    
    public int[][] makeSquare(int longer, int[][] arr) {
        int[][] answer = new int[longer][longer];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}
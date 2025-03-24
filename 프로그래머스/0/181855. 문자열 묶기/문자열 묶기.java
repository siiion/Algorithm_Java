class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] countArr = new int[30];
        
        for (int i = 0; i < strArr.length; i++) {
            countArr[strArr[i].length() - 1]++;
        }
        
        for (int j : countArr) {
            if (j > answer) {
                answer = j;
            }
        }
        
        return answer;
    }
}
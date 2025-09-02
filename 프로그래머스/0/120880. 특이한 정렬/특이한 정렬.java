class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        int[] diff = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            diff[i] = Math.abs(n - numlist[i]);
        }
        
        int cur = 0;
        while (true) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            boolean complete = true;
            
            for (int i = 0; i < diff.length; i++) {
                if (diff[i] != Integer.MAX_VALUE) complete = false;
                if (diff[i] < min) {
                    min = diff[i];
                    idx = i;
                } else if (diff[i] == min && idx != -1 && numlist[i] > numlist[idx]) {
                    idx = i;
                }
            }
            
            if (complete) break;
            
            diff[idx] = Integer.MAX_VALUE;
            answer[cur++] = numlist[idx];
        }
        
        return answer;
    }
}
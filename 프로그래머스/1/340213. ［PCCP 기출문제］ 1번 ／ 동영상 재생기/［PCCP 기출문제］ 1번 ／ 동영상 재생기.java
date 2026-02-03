class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int start_t = toInteger(op_start);
        int end_t = toInteger(op_end);
        int video = toInteger(video_len);
        int cur = toInteger(pos);
        
        for (String cmd : commands) {  
            if (cur >= start_t && cur <= end_t) {
                cur = end_t;
            }
            
            if (cmd.equals("next")) {
                int next = cur + 10;
                if (next % 100 >= 60) {
                    next = cur + 50;
                } 
                cur = next > video ? video : next;
            } else {
                int prev = cur - 10;
                if (prev % 100 >= 60) {
                    prev = cur - 50;
                }
                cur = prev < 0 ? 0 : prev;
            }
        }
        
        if (cur >= start_t && cur <= end_t) {
            cur = end_t;
        }
        
        answer = String.format("%02d", cur / 100);
        answer += ":" + String.format("%02d", cur % 100);
        
        return answer;
    }
    
    private int toInteger(String time) {
        return Integer.parseInt(time.substring(0, 2)) * 100 + Integer.parseInt(time.substring(3));
    }
}
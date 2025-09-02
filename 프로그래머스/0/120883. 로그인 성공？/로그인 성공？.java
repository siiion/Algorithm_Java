class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for (String[] data : db) {
            String data_id = data[0];
            String data_pw = data[1];
            if (id.equals(data_id)) {
                if (pw.equals(data_pw)) answer = "login";
                else answer = "wrong pw";
                break;
            } 
        }
        
        return answer;
    }
}
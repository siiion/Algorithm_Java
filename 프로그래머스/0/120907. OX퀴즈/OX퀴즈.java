class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] cal = quiz[i].split(" ");
            int num1 = Integer.parseInt(cal[0]);
            int num2 = Integer.parseInt(cal[2]);
            int result = Integer.parseInt(cal[4]);
            String op = cal[1];
            
            if (op.equals("+")) {
                if (num1 + num2 == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (num1 - num2 == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}
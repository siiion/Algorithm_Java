class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int push = 0;
        
        if (A.equals(B)) {
            return 0;
        } else {
            while (true) {
                push++;
                String result = "";
                result += A.charAt(A.length() - 1);
                for (int i = 0; i < A.length() - 1; i++) {
                    result += A.charAt(i);
                }
                
                if (result.equals(B)) {
                    return push;
                } else if (push == A.length()) {
                    return - 1;
                }
                
                A = result;
            }
        }
    }
}
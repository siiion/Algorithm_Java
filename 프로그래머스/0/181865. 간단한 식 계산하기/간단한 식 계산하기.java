class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] splitArr = binomial.split(" ");
        int a = Integer.parseInt(splitArr[0]);
        int b = Integer.parseInt(splitArr[2]);
        
        switch (splitArr[1]) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        
        return answer;
    }
}
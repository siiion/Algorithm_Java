class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x");
        int answerLength = 0;
        if (myString.endsWith("x")) {
            answerLength = strArr.length + 1;
        } else {
            answerLength = strArr.length;
        }
        int[] answer = new int[answerLength];
        
        if (strArr.length < answer.length) {
            for (int i = 0; i < strArr.length; i++) {
                answer[i] = strArr[i].length();
            }
            answer[answer.length -1] = 0;
        } else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = strArr[i].length();
            }
        }
        
        return answer;
    }
}
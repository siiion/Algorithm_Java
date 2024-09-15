class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(i, i + 1).equals("a") || myString.substring(i, i + 1).equals("A")) {
                sb.append("A");
            } else {
                sb.append(myString.substring(i, i + 1).toLowerCase());
            }
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}
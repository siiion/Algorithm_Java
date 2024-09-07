class Solution {
    public String solution(String my_string, int[] indices) {
        String[] strArr = my_string.split("");
        
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            strArr[index] = "";
        }
        
        String answer = String.join("", strArr);
        
        return answer;
    }
}
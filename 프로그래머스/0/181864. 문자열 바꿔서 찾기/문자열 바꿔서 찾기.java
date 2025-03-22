class Solution {
    public int solution(String myString, String pat) {
        String answer = myString.replaceAll("A", "C").replaceAll("B", "A").replaceAll("C", "B");
        return answer.contains(pat) ? 1 : 0;
    }
}
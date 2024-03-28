class Solution {
    public int solution(int a, int b) {
        String str1 = (a + "") + (b + "");
        String str2 = (b + "") + (a + "");
        int answer = Integer.parseInt(str1) >= Integer.parseInt(str2) ? Integer.parseInt(str1) : Integer.parseInt(str2);
        return answer;
    }
}
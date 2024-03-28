class Solution {
    public int solution(int a, int b) {
        String str1 = (a + "") + (b + "");
        String str2 = (b + "") + (a + "");
        int answer = Integer.valueOf(str1) >= Integer.valueOf(str2) ? Integer.valueOf(str1) : Integer.valueOf(str2);
        return answer;
    }
}
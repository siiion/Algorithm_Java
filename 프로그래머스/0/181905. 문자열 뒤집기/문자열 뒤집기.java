class Solution {
    public String solution(String my_string, int s, int e) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(e + 1, my_string.length());
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse();
        return before + sb + after;
    }
}
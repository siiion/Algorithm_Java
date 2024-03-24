class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] array = my_string.split("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < 10; j++) {
                if (array[i].equals(j + "")) answer += j;
            }
        }
        return answer;
    }
}
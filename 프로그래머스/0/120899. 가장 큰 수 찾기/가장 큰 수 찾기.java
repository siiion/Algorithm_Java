class Solution {
    public int[] solution(int[] array) {
        int largest = -1;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
                index = i;
            }
        }
        int[] answer = {largest, index};
        return answer;
    }
}
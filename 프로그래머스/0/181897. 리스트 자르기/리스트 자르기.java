import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> arrList = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch (n) {
            case 1:
                for (int i = 0; i <= b; i++) {
                    arrList.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = a; i < num_list.length; i++) {
                    arrList.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = a; i <= b; i++) {
                    arrList.add(num_list[i]);
                }
                break;
            default:
                for (int i = a; i <= b; i += c) {
                    arrList.add(num_list[i]);
                }
                break;
        }
        
        int[] answer = arrList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
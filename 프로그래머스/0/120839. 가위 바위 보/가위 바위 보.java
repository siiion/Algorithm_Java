class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] array = rsp.split("");
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case "2":
                    answer += "0";
                    break;
                case "0":
                    answer += "5";
                    break;
                default:
                    answer += "2";
            }
        }
        return answer;
    }
}
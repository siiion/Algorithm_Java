class Solution {
    public int solution(String number) {
        int sum = 0;
        String[] num = number.split("");
        
        for (int i = 0; i < num.length; i++) {
            sum += Integer.parseInt(num[i]);
        }
        
        return sum % 9;
    }
}
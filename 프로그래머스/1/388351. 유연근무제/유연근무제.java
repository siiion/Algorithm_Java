class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        boolean flag = true;
        
        for (int i = 0; i < schedules.length; i++) {
            int schedule = schedules[i] + 10;
            if (schedule % 100 >= 60) {
                schedule = (schedule / 100 + 1) * 100 + (schedule % 100 - 60);
            }
            System.out.println(schedule);
            for (int j = 0; j < 7; j++) {
                int today = (startday + j) % 7;
                if (today == 0 || today == 6) continue;
                if (timelogs[i][j] > schedule) {
                    flag = false;
                    System.out.println(today + ": " + flag);
                    break;
                }
                System.out.println(today + ": " + flag);
            }
            if (flag) answer++;
            flag = true;
        }
        return answer;
    }
}
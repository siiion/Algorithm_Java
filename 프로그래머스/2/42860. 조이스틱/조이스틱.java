class Solution {
    public int solution(String name) {
        int answer = 0;
        int n = name.length();
        
        // 위 아래 이동
        for (int i = 0; i < n; i++) {
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 26 - (c - 'A'));
        }
        
        // 좌우 이동
        // 기본 (왼쪽부터 일렬로)
        int move = n - 1; 
        
        for (int i = 0; i < n; i++) {
            // next는 A 이후로 처음 나타나는 A가 아닌 글자의 위치
            int next = i + 1;
            for (int j = next; j < n; j++) {
                if (name.charAt(j) != 'A') break;
                next++;
            }
            
            // 왼쪽부터 출발 -> 되돌아가서 끝처리(오른쪽)
            // vs. 오른쪽부터 출발-> 되돌아가서 끝처리(왼쪽)
            move = Math.min(move, 2 * i + (n - next));
            move = Math.min(move, 2 * (n - next) + i);
        }
        
        return answer + move;
    }
}
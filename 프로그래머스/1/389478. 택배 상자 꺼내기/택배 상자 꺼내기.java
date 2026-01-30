class Solution {
    int n, w, num;
    
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        this.n = n;
        this.w = w;
        this.num = num;
        
        int n_row = row(n);
        int n_col = col(n, n_row);
        int num_row = row(num);
        int num_col = col(num, num_row);
        
        if (n_row % 2 == 0) {
            answer = num_col >= n_col ? n_row - num_row + 1 : n_row - num_row;
        } else {
            answer = n_col >= num_col ? n_row - num_row + 1 : n_row - num_row;
        }
        
        return answer;
    }
    
    private int row(int i) {
        return i % w == 0 ? i / w : i / w + 1;
    }
    
    private int col(int i, int r) {
        int c = 0;
        
        if (i <= w) {
            c = i;
        } else if (r % 2 == 0) {
            c = i % w == 0 ? 1 : w - i % w + 1;
        } else {
            c = i % w == 0 ? w : i % w;
        }
        
        return c;
    }
}
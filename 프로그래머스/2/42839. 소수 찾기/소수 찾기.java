import java.util.*;

class Solution {
    // 중복값 제거 위함
    HashSet<Integer> primes = new HashSet<>();
    
    public int solution(String numbers) {
        recursive("", numbers);
        
        return primes.size();
    }
    
    // 모든 숫자 조합 탐색 (재귀)
    // comb: 현재까지의 숫자 문자열 / others: 아직 사용하지 않은 숫자 문자들
    public void recursive(String comb, String others) {
        if (!comb.equals("") && isPrime(comb)) {
            primes.add(Integer.parseInt(comb));
        }
        
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i+1));
        }
    }
    
    // 소수 여부 판별
    public boolean isPrime(String num) {
        int n = Integer.parseInt(num);
        if (n == 0 || n == 1) return false;
        
        // 루트 n까지만 확인
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            answer += n % 10;  // 마지막 자리수를 더하고
            n /= 10;           // 마지막 자리수를 제외한 나머지를 남김
        }
        
        return answer;
    }
}
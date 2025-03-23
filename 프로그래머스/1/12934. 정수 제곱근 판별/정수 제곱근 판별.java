class Solution {
    public long solution(long n) {
        long answer = -1;  // 기본 값은 -1
        
        // n의 제곱근을 구하고 정수인지 확인
        long root = (long) Math.sqrt(n);  // 제곱근을 long 타입으로 변환
        
        // n이 제곱수인지 확인
        if (root * root == n) {
            // 제곱수가 맞다면 (root + 1)^2 반환
            answer = (root + 1) * (root + 1);
        }
        
        return answer;  // 제곱수가 아니라면 기본값인 -1을 반환
    }
}
class Solution {
    public int solution(int num) {
        int answer = 0;
        
        // 입력된 수가 1 <= num < 8,000,000 이라 Long으로 형변환
        long n = num; 
        
        // n이 1이 아닐때 까지 반복
        while(n != 1){
            
            // 계산 횟수가 500이 넘으면 -1 리턴
            if (answer == 500) return -1;
            
            // n이 짝수면 2로 나누고, 홀수면 3을 곱하고 1을 더함
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            
            // 계산 횟수 1 추가
            answer ++;
        }

        return answer;
    }
}
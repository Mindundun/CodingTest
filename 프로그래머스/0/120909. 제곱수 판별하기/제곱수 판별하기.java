class Solution {
    public int solution(int n) {
        int answer = 0;
        // 제곱한 수가 n과 같다면 제곱수다! 
        if((int) Math.sqrt(n) * (int) Math.sqrt(n) == n ){ //  n % (int) Math.sqrt(n) == 0 가능
            answer = 1;
        } else {
            answer = 2;
        }
                
        return answer;
    }
}